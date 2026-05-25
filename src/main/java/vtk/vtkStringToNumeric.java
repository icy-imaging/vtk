// java wrapper for vtkStringToNumeric object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStringToNumeric extends vtkDataObjectAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetForceDouble_4(boolean id0);
  public void SetForceDouble(boolean id0)
  {
    SetForceDouble_4(id0);
  }

  private native boolean GetForceDouble_5();
  public boolean GetForceDouble()
  {
    return GetForceDouble_5();
  }

  private native void ForceDoubleOn_6();
  public void ForceDoubleOn()
  {
    ForceDoubleOn_6();
  }

  private native void ForceDoubleOff_7();
  public void ForceDoubleOff()
  {
    ForceDoubleOff_7();
  }

  private native void SetDefaultIntegerValue_8(int id0);
  public void SetDefaultIntegerValue(int id0)
  {
    SetDefaultIntegerValue_8(id0);
  }

  private native int GetDefaultIntegerValue_9();
  public int GetDefaultIntegerValue()
  {
    return GetDefaultIntegerValue_9();
  }

  private native void SetDefaultDoubleValue_10(double id0);
  public void SetDefaultDoubleValue(double id0)
  {
    SetDefaultDoubleValue_10(id0);
  }

  private native double GetDefaultDoubleValue_11();
  public double GetDefaultDoubleValue()
  {
    return GetDefaultDoubleValue_11();
  }

  private native void SetTrimWhitespacePriorToNumericConversion_12(boolean id0);
  public void SetTrimWhitespacePriorToNumericConversion(boolean id0)
  {
    SetTrimWhitespacePriorToNumericConversion_12(id0);
  }

  private native boolean GetTrimWhitespacePriorToNumericConversion_13();
  public boolean GetTrimWhitespacePriorToNumericConversion()
  {
    return GetTrimWhitespacePriorToNumericConversion_13();
  }

  private native void TrimWhitespacePriorToNumericConversionOn_14();
  public void TrimWhitespacePriorToNumericConversionOn()
  {
    TrimWhitespacePriorToNumericConversionOn_14();
  }

  private native void TrimWhitespacePriorToNumericConversionOff_15();
  public void TrimWhitespacePriorToNumericConversionOff()
  {
    TrimWhitespacePriorToNumericConversionOff_15();
  }

  private native void SetConvertFieldData_16(boolean id0);
  public void SetConvertFieldData(boolean id0)
  {
    SetConvertFieldData_16(id0);
  }

  private native boolean GetConvertFieldData_17();
  public boolean GetConvertFieldData()
  {
    return GetConvertFieldData_17();
  }

  private native void ConvertFieldDataOn_18();
  public void ConvertFieldDataOn()
  {
    ConvertFieldDataOn_18();
  }

  private native void ConvertFieldDataOff_19();
  public void ConvertFieldDataOff()
  {
    ConvertFieldDataOff_19();
  }

  private native void SetConvertPointData_20(boolean id0);
  public void SetConvertPointData(boolean id0)
  {
    SetConvertPointData_20(id0);
  }

  private native boolean GetConvertPointData_21();
  public boolean GetConvertPointData()
  {
    return GetConvertPointData_21();
  }

  private native void ConvertPointDataOn_22();
  public void ConvertPointDataOn()
  {
    ConvertPointDataOn_22();
  }

  private native void ConvertPointDataOff_23();
  public void ConvertPointDataOff()
  {
    ConvertPointDataOff_23();
  }

  private native void SetConvertCellData_24(boolean id0);
  public void SetConvertCellData(boolean id0)
  {
    SetConvertCellData_24(id0);
  }

  private native boolean GetConvertCellData_25();
  public boolean GetConvertCellData()
  {
    return GetConvertCellData_25();
  }

  private native void ConvertCellDataOn_26();
  public void ConvertCellDataOn()
  {
    ConvertCellDataOn_26();
  }

  private native void ConvertCellDataOff_27();
  public void ConvertCellDataOff()
  {
    ConvertCellDataOff_27();
  }

  private native void SetConvertVertexData_28(boolean id0);
  public void SetConvertVertexData(boolean id0)
  {
    SetConvertVertexData_28(id0);
  }

  private native boolean GetConvertVertexData_29();
  public boolean GetConvertVertexData()
  {
    return GetConvertVertexData_29();
  }

  private native void ConvertVertexDataOn_30();
  public void ConvertVertexDataOn()
  {
    ConvertVertexDataOn_30();
  }

  private native void ConvertVertexDataOff_31();
  public void ConvertVertexDataOff()
  {
    ConvertVertexDataOff_31();
  }

  private native void SetConvertEdgeData_32(boolean id0);
  public void SetConvertEdgeData(boolean id0)
  {
    SetConvertEdgeData_32(id0);
  }

  private native boolean GetConvertEdgeData_33();
  public boolean GetConvertEdgeData()
  {
    return GetConvertEdgeData_33();
  }

  private native void ConvertEdgeDataOn_34();
  public void ConvertEdgeDataOn()
  {
    ConvertEdgeDataOn_34();
  }

  private native void ConvertEdgeDataOff_35();
  public void ConvertEdgeDataOff()
  {
    ConvertEdgeDataOff_35();
  }

  private native void SetConvertRowData_36(boolean id0);
  public void SetConvertRowData(boolean id0)
  {
    SetConvertRowData_36(id0);
  }

  private native boolean GetConvertRowData_37();
  public boolean GetConvertRowData()
  {
    return GetConvertRowData_37();
  }

  private native void ConvertRowDataOn_38();
  public void ConvertRowDataOn()
  {
    ConvertRowDataOn_38();
  }

  private native void ConvertRowDataOff_39();
  public void ConvertRowDataOff()
  {
    ConvertRowDataOff_39();
  }

  public vtkStringToNumeric() { super(); }

  public vtkStringToNumeric(long id) { super(id); }
  public native long   VTKInit();

}
