package collection.treeset;

import java.util.Comparator;

import collection.Member;

public class Member2 implements Comparator<Member> {

    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    @Override
    public int compare(Member o1, Member o2) {
        return o1.getMemberId() - o2.getMemberId();
    }

}
