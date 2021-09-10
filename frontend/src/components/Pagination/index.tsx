import { SalePage } from "types/sale";

type Props = {
  page: SalePage;
}


function Pagination({ page }: Props) {
  return (
    <div className="row d-flex justify-content-center">
      <nav>
        <ul className="pagination">
          <li className="page-item">
            <button className="page-link">Previous</button>
          </li>
          <li className="page-item disabled">
            <span className="page-link">1</span>
          </li>
          <li className="page-item">
            <button className="page-link">Next</button>
          </li>
        </ul>
      </nav>
    </div>

  )
}
export default Pagination;