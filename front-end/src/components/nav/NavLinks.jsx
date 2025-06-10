import { NavLink } from 'react-router-dom';

const links = [
    { to: '/', label: 'Home', exact: true },
    { to: '/posts', label: 'Posts' },
    { to: '/about', label: 'About' },
];

function NavLinks() {
    return (
        <ul className="flex space-x-6 text-lg">
            {links.map(({ to, label, exact }) => (
                <li key={to}>
                    <NavLink
                        to={to}
                        end={exact}
                        className={({ isActive }) =>
                            isActive
                                ? 'text-yellow-300 font-semibold'
                                : 'hover:text-gray-200 transition-colors'
                        }
                    >
                        {label}
                    </NavLink>
                </li>
            ))}
        </ul>
    );
}

export default NavLinks;
