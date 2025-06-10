import Header from './Header';

function Layout({ children }) {
    return (
        <div className="min-h-screen flex flex-col">
            <Header />
            <main className="flex-1 max-w-5xl mx-auto px-4 py-8">{children}</main>
        </div>
    );
}

export default Layout;