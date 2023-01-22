
import { BrowserRouter, Routes, Route } from "react-router-dom";
import NoPage from "./pages/NoPage";
import Home from "./pages/Home";
import Layout from "./pages/Layout";
import Grocery from "./components/Grocery";
import Bill from "./components/Bill";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Layout />}>
                    <Route index element={<Home />} />
                    <Route path="*" element={<NoPage />} />
                    <Route path="/grocery" element={<Grocery />} />
                    <Route path="/bill" element={<Bill />} />
                </Route>
            </Routes>
        </BrowserRouter>
    );
}

export default App;