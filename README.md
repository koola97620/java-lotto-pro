# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## 문자열 덧셈 계산기

### 기능 목록

  * [X] 빈 문자열 또는 null 입력시 0 반환한다
  * [X] 숫자 하나를 문자열로 입력시 해당 숫자를 반환한다
  * [X] 숫자 두개를 컴마로 구분하여 입력시 두 숫자의 합을 반환한다
  * [X] 숫자 두개를 콜론로 구분하여 입력시 두 숫자의 합을 반환한다
  * [X] 커스텀 구분자를 지정할 수 있다
  * [X] 음수 입력시 RuntimeException 발생한다


## 로또

### 기능 목록

  * [x] 금액 입력 기능
  * [x] 로또 구매 개수 계산 기능
    * 1장에 1,000원
  * [x] 로또 공 생성 기능
    * 로또 번호는 1~45 생성 가능
    * 6개의 서로 다른 공을 생성
  * [x] 로또 구매 기능
    * 구매 회수 만큼 생성
  * [x] 뽑은 로또 공 출력 기능
  * [x] 당첨 번호 입력 기능
  * [x] 당첨 통계 계산 기능
    * 일치하는 공의 개수 구하는 기능
    * 수익률 계산 기능
  * [x] 통계 출력 기능 

### 추가 기능 목록 1

  * [x] 보너스 공 입력 기능
  * [x] 2등 계산 기능
    * 5개의 공 일치 + 보너스 공 일치하면 2등
  * [x] 2등 통계 출력 기능

### 추가 기능 목록 2

  * [x] 수동으로 구매할 로또 개수 입력 기능
  * [x] 수동 로또 번호 입력 기능
  * [x] 수동 로또 공 생성하는 기능
  * [ ] 자동 개수와 수동 개수 계산하는 기능
  * [ ] 수동 입력한 로또 공과 자동 로또 공을 합치는 기능
