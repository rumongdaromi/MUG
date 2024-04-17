import styles from "./nojoinseachComponent1.module.css";

const nojoinseachComponent1 = () => {
    return (
        <div className={styles.rectangleParent}>
            <div className={styles.frameChild} />
            <div className={styles.frameWrapper}>
                <div className={styles.existingMemberLabelParent}>
                    <div className={styles.existingMemberLabel} />
                    <div className={styles.div}> 기존 회원</div>
                </div>
            </div>
            <div className={styles.rectangleGroup}>
                <div className={styles.frameItem} />
                <div className={styles.div1}> 비회원 조회</div>
            </div>
        </div>
    );
};

export default nojoinseachComponent1;