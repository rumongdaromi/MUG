import styles from "./JoinPage.module.css";

const JoinPage = () => {
    return (
        <div className={styles.div}>
            <img className={styles.child} alt="" />
            <div className={styles.item} />
            <div className={styles.inner} />
            <div className={styles.div1}> 기존 회원</div>
            <div className={styles.rectangleDiv} />
            <div className={styles.div2}> 비회원 조회</div>
            <div className={styles.div3}>주문자명을 입력해 주세요.</div>
            <img className={styles.lineIcon} alt="" src={require("../components/line-4.svg")} />
            <img className={styles.child1} alt="" src={require("../components/line-4.svg")} />
            <div className={styles.div4}>주문번호를 입력해 주세요.</div>
            <div className={styles.child2} />
            <div className={styles.child3} />
            <div className={styles.div5}>비회원 주문조회</div>
            <div className={styles.div6}>카카오 1초 로그인 / 회원가입</div>
                < img className={styles.image3Icon} alt="" src={require("../components/image-3@2x.png")} />


                    <div className={styles.mug}>MUG</div>

        </div>
    );
};

export default JoinPage;