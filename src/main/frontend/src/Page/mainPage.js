import React, { useState, useEffect } from 'react';
import styles from "./mainPage.module.css";

const MainPage = () => {

    const [currentIndex, setCurrentIndex] = useState(0);

    useEffect(() => {
        const interval = setInterval(() => {
            setCurrentIndex((prevIndex) => (prevIndex + 1) % 6); // 6개 요소를 순환
        }, 10000); // 10초마다 실행

        return () => clearInterval(interval); // 컴포넌트 언마운트 시 인터벌 정리
    }, []);

    return (
        <>
            <div className={styles.div}>
                <div className={styles.mug}>MUG</div>
                <img className={styles.image4Icon} alt="" src={require("../components/image-4@2x.png")}/>
                <img className={styles.image5Icon} alt="" src={require("../components/image-5@2x.png")}/>
                <div className={styles.child}/>
                <img className={styles.image6Icon} alt="" src={require("../components/image-6@2x.png")}/>
                <div className={styles.item}/>
                <div className={styles.categori}>
                    <img className={styles.image7Icon} alt="" src={require("../components/image-7@2x.png")}/>
                    <img className={styles.image8Icon} alt="" src={require("../components/image-8@2x.png")}/>
                    <img className={styles.image9Icon} alt="" src={require("../components/image-9@2x.png")}/>
                    <img className={styles.image10Icon} alt="" src={require("../components/image-10@2x.png")}/>
                    <img className={styles.image11Icon} alt="" src={require("../components/image-11@2x.png")}/>
                    <img className={styles.image12Icon} alt="" src={require("../components/image-12@2x.png")}/>
                </div>
                <div className={styles.divNav}>
                    <div className={styles.div1}>추천</div>
                    <div className={styles.div2}>스타일</div>
                    <div className={styles.div3}>할인</div>
                    <div className={styles.div4}>브랜드</div>
                    <div className={styles.div5}>큐레이션</div>
                </div>
            </div>
            <div className={styles.div_1}>
                <div className={styles.top5}>가성비 추천템 TOP 5</div>
                <img className={styles.image18Icon} alt="" src={require("../components/image-18@2x.png")}/>
                <div className={styles.div1}>더보기</div>








            </div>
        </>
    );
};

export default MainPage;
