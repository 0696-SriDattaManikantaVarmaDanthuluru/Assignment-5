package pol;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PolicyManager {
    private HashSet<Policy> policiesHashSet;
    private LinkedHashSet<Policy> policiesLinkedHashSet;
    private TreeSet<Policy> policiesTreeSet;

    public PolicyManager() {
        policiesHashSet = new HashSet<>();
        policiesLinkedHashSet = new LinkedHashSet<>();
        policiesTreeSet = new TreeSet<>();
    }

    public void addPolicy(Policy policy) {
        policiesHashSet.add(policy);
        policiesLinkedHashSet.add(policy);
        policiesTreeSet.add(policy);
    }

    public HashSet<Policy> getAllUniquePolicies() {
        return policiesHashSet;
    }

    public LinkedHashSet<Policy> getPoliciesExpiringSoon() {
        LinkedHashSet<Policy> expiringSoon = new LinkedHashSet<>();
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysFromNow = today.plusDays(30);

        for (Policy policy : policiesLinkedHashSet) {
            if (policy.getExpiryDate().isBefore(thirtyDaysFromNow)) {
                expiringSoon.add(policy);
            }
        }

        return expiringSoon;
    }

        return policiesLinkedHashSet;
    }

    public TreeSet<Policy> getPoliciesByCoverage(String coverageType) {...
        TreeSet<Policy> policiesByCoverage = new TreeSet<>();

        for (Policy policy : policiesTreeSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policiesByCoverage.add(policy);
            }
        }

        return policiesByCoverage;
    }


        return policiesTreeSet;
    }

    public HashSet<Policy> findDuplicatePolicies() {
        HashSet<Policy> duplicatePolicies = new HashSet<>();
        HashSet<String> policyNumbersSeen = new HashSet<>();

        for (Policy policy : policiesHashSet) {
            String policyNumber = policy.getPolicyNumber();
            if (policyNumbersSeen.contains(policyNumber)) {
                duplicatePolicies.add(policy);
            } else {
               policyNumbersSeen.add(policyNumber);
            }
        }

        return duplicatePolicies;
    }
       return policiesHashSet;
    }

    // Other methods for performance comparison, etc.
}
