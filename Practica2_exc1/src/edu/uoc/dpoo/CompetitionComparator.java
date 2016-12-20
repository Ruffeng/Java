package edu.uoc.dpoo;


public class CompetitionComparator  implements java.util.Comparator<Submission> {

		@Override
		public int compare(Submission s1, Submission s2) {
			return s1.getError() < s2.getError() ? -1 
             : s1.getError() > s2.getError() ? 1 
             : 0;
		}

	

}
