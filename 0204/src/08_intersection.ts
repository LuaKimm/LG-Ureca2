/*
intersection
타입 A가 있고 타입 B가 있다면 intersection을 통해 A이면서 B인 타입을 정의한다.


형식]
type 타입명A {
속성명: 타입,...
}

type 타입명B {
속성명: 타입,...
}


type 타입명C = 타입명A & 타입명B;
지양하는 편임 : intersection을 사용하지 않는다.
*/

type cup={ size: string }
type brand={brandName: String}
type brandCup = cup & brand;

let starbucks : brandCup = { size: 'small', brandName: 'Starbucks' };
