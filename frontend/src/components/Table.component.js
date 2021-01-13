import {Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow} from "@material-ui/core";
import PropTypes from "prop-types";

const GameWebTable = ({columns, data}) => {
    if (columns) {
        return (
            <TableContainer component={Paper}>
                <Table>
                    <TableHead>
                        <TableRow>
                            {columns.map(col => <TableCell>{col.label}</TableCell>)}
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {data && data.map(row => (
                            <TableRow key={row.name}>
                                {columns.map(col => <TableCell>{col.valueFun(row)}</TableCell>)}
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </TableContainer>
        );
    } else {
        return <div>Simple table component</div>
    }
};

Table.propTypes = {
    columns: PropTypes.arrayOf(PropTypes.shape({
        label: PropTypes.string.isRequired,
        valueFun: PropTypes.func.isRequired
    })),
    data: PropTypes.array
}

export default GameWebTable;