import { useEffect } from "react";
import {
    Routes,
    Route,
    useNavigationType,
    useLocation,
    Navigate, // Navigate 컴포넌트를 import 합니다.
} from "react-router-dom";
import Frame from "./Page/JoinPage";
import Nojoinseach from "./Page/nojoinseach"
import MainPage from "./Page/mainPage"
function App() {



    return (
        <Routes>
            <Route path="/" element={<Navigate replace to="/JoinPage" />} />
            <Route path="/" element={<Navigate replace to="/Nojoinseach" />} />
            <Route path="/" element={<Navigate replace to="/MainPage" />} />

            <Route path="/JoinPage" element={<Frame />} />
            <Route path="/nojoin" element={<Nojoinseach />} />
            <Route path="/MainPage" element={<MainPage />} />

        </Routes>
    );
}
export default App;
