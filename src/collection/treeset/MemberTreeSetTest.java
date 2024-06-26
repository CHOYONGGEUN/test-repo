package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberPark = new Member(1003, "박서훤");
        Member memberLee = new Member(1002, "이지원");
        Member memberSon = new Member(1001, "송민국");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.showAllMember();
        Member memberHong = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }

}
