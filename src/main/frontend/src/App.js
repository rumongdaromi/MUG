import { useEffect } from "react";
import {
    Routes,
    Route,
    useNavigationType,
    useLocation,
    Navigate, // Navigate 컴포넌트를 import 합니다.
} from "react-router-dom";
import Frame from "./Page/JoinPage";

function App() {



    return (
        <Routes>
            <Route path="/" element={<Navigate replace to="/JoinPage" />} />
            <Route path="/JoinPage" element={<Frame />} />
        </Routes>
    );
}
export default App;
