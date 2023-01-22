import React from 'react';
import DataTable from 'react-data-table-component';
// import { Checkbox } from '@mui/material';
import { AiOutlineArrowDown } from 'react-icons/ai';

const sortIcon = <AiOutlineArrowDown />;
const selectProps = { indeterminate: isIndeterminate => isIndeterminate };

function DataTableBase(props) {
    return (
        <DataTable
            pagination
            // selectableRowsComponent={Checkbox}
            selectableRowsComponentProps={selectProps}
            sortIcon={sortIcon}
            // dense
            {...props}
        />
    );
}

export default DataTableBase;
