package pol;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        PolicyManager policyManager = new PolicyManager();
        Policy policy1 = new Policy("P011", "Arjun",02, "Health", 500.0);
        Policy policy2 = new Policy("P002", "Yash",01, "Auto", 800.0);
        Policy policy3 = new Policy("P029", "Bob", 01, "Home", 1200.0);


        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);
        policyManager.addPolicy(policy3);

        HashSet<Policy> uniquePolicies = policyManager.getAllUniquePolicies();
        LinkedHashSet<Policy> expiringSoon = policyManager.getPoliciesExpiringSoon();
        TreeSet<Policy> healthPolicies = policyManager.getPoliciesByCoverage("Health");
        HashSet<Policy> duplicates = policyManager.findDuplicatePolicies();

        HashSet<Policy> uniquePolicies = policyManager.getAllUniquePolicies();
        System.out.println("Unique Policies:");
        for (Policy policy : uniquePolicies) {
            System.out.println(policy);
        }

        LinkedHashSet<Policy> expiringSoon = policyManager.getPoliciesExpiringSoon();
        System.out.println("\nPolicies Expiring Soon (within the next 30 days):");
        for (Policy policy : expiringSoon) {
            System.out.println(policy);
        }


        TreeSet<Policy> healthPolicies = policyManager.getPoliciesByCoverage("Health");
        System.out.println("\nHealth Policies:");
        for (Policy policy : healthPolicies) {
            System.out.println(policy);
        }

        HashSet<Policy> duplicates = policyManager.findDuplicatePolicies();
        System.out.println("\nDuplicate Policies (based on policy numbers):");
        for (Policy policy : duplicates) {
            System.out.println(policy);
        }
    }
}
