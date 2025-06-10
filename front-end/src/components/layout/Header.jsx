import NavLinks from '../nav/NavLinks';

function Header() {
    return (
        <header className="bg-gray-800 text-white px-6 py-4">
            <div className="max-w-5xl mx-auto flex justify-between items-center">
                <h1 className="text-xl font-bold">Minwoo's Tech Blog</h1>
                <NavLinks />
            </div>
        </header>
    );
}

export default Header;
