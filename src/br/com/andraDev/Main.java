package br.com.andraDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static final List<String> selectedCandidates = new ArrayList<>();
  
  public static void main(String[] args) {
    System.out.println("Selection Process");
    candidateSelection();
  }
  
  public static void candidateSelection() {
    String[] candidates = {"Willian", "Fernanda", "Adriana", "Adriano", "Jonas",
        "Berthold", "Vanessa", "Augusto", "Marcela", "Felipe"};
    
    int selectedCandidatesAmount = 0;
    
    for (String candidate : candidates) {
      System.out.println(STR."Analyzing candidate: \{candidate}");
      
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
  
  public static void printSelectedCandidates() {
    for (String candidate: selectedCandidates) {
      System.out.println(STR."The candidate: \{candidate} was selected.");
    }
  }
}