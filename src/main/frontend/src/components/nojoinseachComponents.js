import styles from "./nojoinseachComponent.module.css";

const nojoinseachComponent = () => {
    return (
        <div className={styles.frameParent}>
            <div className={styles.wrapper}>
                <div className={styles.div}>주문자명을 입력해 주세요.</div>
            </div>
            <div className={styles.vectorParent}>
                <img className={styles.frameChild} alt="" />
                <img
                    className={styles.frameItem}
                    loading="lazy"
                    alt=""
                    src="/line-4.svg"
                />
                <img
                    className={styles.frameInner}
                    loading="lazy"
                    alt=""
                    src="/line-4.svg"
                />
            </div>
            <div className={styles.div1}>주문번호를 입력해 주세요.</div>
        </div>
    );
};

export default nojoinseachComponent;