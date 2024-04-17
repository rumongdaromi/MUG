import FrameComponent1 from "../components/nojoinseachComponents1";
import FrameComponent from "../components/nojoinseachComponents";
import styles from "../components/nojoinseach.module.css";

const nojoinseach = () => {
    return (
        <div className={styles.div}>
            <div className={styles.mugWrapper}>
                <h1 className={styles.mug}>MUG</h1>
            </div>
            <div className={styles.inner}>
                <FrameComponent1 />
            </div>
            <div className={styles.frameParent}>
                <div className={styles.frameGroup}>
                    <FrameComponent />
                    <div className={styles.frameWrapper}>
                        <button className={styles.rectangleParent}>
                            <div className={styles.frameChild} />
                            <div className={styles.div1}>비회원 주문조회</div>
                        </button>
                    </div>
                </div>
                <div className={styles.frameContainer}>
                    <div className={styles.frameDiv}>
                        <button className={styles.rectangleGroup}>
                            <div className={styles.frameItem} />
                            <div className={styles.div2}>카카오 1초 로그인 / 회원가입</div>
                        </button>
                        <img
                            className={styles.image3Icon}
                            loading="lazy"
                            alt=""
                            src="../components/image-3@2x.png"
                        />
                    </div>
                </div>
            </div>
        </div>
    );
};

export default nojoinseach;