package br.com.andraDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
  private static final List<String> selectedCandidates = new ArrayList<>();
  
  public static void main(String[] args) {
    System.out.println("Selection Process");
    candidateSelection();
    
    for (String candidate : selectedCandidates) {
      callCandidate(candidate);
    }
  }
  
  public static void callCandidate(String candidate) {
    int retries = 1;
    boolean keepTrying = true;
    boolean candidateAnsweredThePhone = false;
    
    do {
      candidateAnsweredThePhone = pickup();
      keepTrying = !candidateAnsweredThePhone;
      
      if (keepTrying) {
        retries++;
      }
    }
    while (keepTrying && retries < 3);
    
    if (candidateAnsweredThePhone) {
      System.out.println("We were able to get in touch with " + candidate + " in " + retries + " tries.");
    } else {
      System.out.println("We weren't able to get in touch with " + candidate + ". We tried " + retries + " times with no success.");
    }
  }
  
  public static boolean pickup() {
    return new Random().nextInt(3) == 1;
  }
  
  public static void printSelectedCandidates() {
    for (String candidate: selectedCandidates) {
      System.out.println("The candidate: " + candidate + " was selected.");
    }
  }
  
  public static void candidateSelection() {
    String[] candidates = {"Willian", "Fernanda", "Adriana", "Adriano", "Jonas",
        "Berthold", "Vanessa", "Augusto", "Marcela", "Felipe"};
    
    int selectedCandidatesAmount = 0;
    
    for (String candidate : candidates) {
      System.out.println("Analyzing candidate: " + candidate);
      
      if (analyzeCandidate()) {
        selectedCandidatesAmount++;
        selectedCandidates.add(candidate);
      }
      
      if (selectedCandidatesAmount == 5) break;
    }
    
    printSelectedCandidates();
  }
  
  public static boolean analyzeCandidate() {
    Scanner inputReader = new Scanner(System.in);
    final double SALARY_RANGE = 2000.0;
    
    System.out.println("Please, enter your pretended salary range below.");
    float pretendedSalary = inputReader.nextFloat();
    
    if (SALARY_RANGE > pretendedSalary) {
      System.out.println("CALL CANDIDATE!");
      return true;
    }
    
    if (SALARY_RANGE == pretendedSalary) {
      System.out.println("CALL CANDIDATE WITH COUNTER OFFER!");
      return true;
    }
    
    if (SALARY_RANGE < pretendedSalary) {
      System.out.println("WAIT FOR RESULTS OF MORE CANDIDATES!");
      return false;
    }
    
    return false;
  }
}