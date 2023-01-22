import { Outlet, Link } from "react-router-dom";
const Layout = () => {
    return (
        <>
            <div id="sidebar">
                <nav>
                    <ul>
                        <li>
                            <Link to="/">Home</Link>
                        </li>
                        <li>
                            <Link to="/grocery">Grocery</Link>
                        </li>
                        <li>
                            <Link to="/bill">Bill</Link>
                        </li>
                    </ul>
                </nav>
            </div>
            <Outlet />
        </>)
};
export default Layout;
