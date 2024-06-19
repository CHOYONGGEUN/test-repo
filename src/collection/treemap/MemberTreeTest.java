package collection.treemap;

import collection.Member;

public class MemberTreeTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberPark = new Member(1003, "박시환");
        Member memberLee = new Member(1001, "이지원");
        Member memberHong = new Member(1004, "홍길동");
        Member memberSon = new Member(1002, "손민국");

        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberSon);

        memberTreeMap.showAllMember();
        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();

    }
}
