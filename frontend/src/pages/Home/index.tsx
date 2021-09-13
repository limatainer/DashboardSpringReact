import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

function Home() {
  return (
    <>
      <NavBar />
      <br />
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">CrossFitness</h1>
          <p className="lead">CrossFitness Client Dashboard</p>
          <br />
          <hr />
          <p>Dashboard seed comes from Spring boot Postgress tools</p>
          <Link className="btn btn-success btn-lg" to="/dashboard">
            Access Dashboard
          </Link>
        </div>
      </div>
      <br />
      <br />
      <Footer />
    </>


  );
}

export default Home;