package chap_07;
// 클래스 쓰는 이유 배워보기
public class _01_Class {
    // 객체 지향 프로그래밍 (OOP :Object - Oriented Programming)
    // 유지보수 용이
    // 높은 재사용성

    // 차량용 블랙박스
    // 모델명, 해상도 가격, 색상
    String modelName = "까망이";
    String resolution = "FHD";
    int price = 200000;
    String color ="블랙";
    // 새로운 제품을 개발
    String modelName2 ="하양이";
    String resolution2 = "UHD";
    int price2 = 250000;
    // 또다른 제품 개발하면??
    BlackBox bbox = new BlackBox();
    // Blackbox 클래스로부터 bbox 객체 생성
    // bbox 객체는 Blackbox 클래스의 인스턴스
    // 이제 고정된 정보를 효율적으로 관리 가능
}
