// java wrapper for vtkTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTable extends vtkDataObject
{

  private native long ExtendedNew_0();
  public vtkTable ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsTypeOf_1(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_1(bytes0, bytes0.length);
  }

  private native int IsA_2(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_3(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_4(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_4(bytes0, bytes0.length);
  }

  private native void Dump_5(int id0,int id1);
  public void Dump(int id0,int id1)
  {
    Dump_5(id0,id1);
  }

  private native int GetDataObjectType_6();
  public int GetDataObjectType()
  {
    return GetDataObjectType_6();
  }

  private native long GetActualMemorySize_7();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_7();
  }

  private native long GetRowData_8();
  public vtkDataSetAttributes GetRowData()
  {
    long temp = GetRowData_8();

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRowData_9(vtkDataSetAttributes id0);
  public void SetRowData(vtkDataSetAttributes id0)
  {
    SetRowData_9(id0);
  }

  private native long GetNumberOfRows_10();
  public long GetNumberOfRows()
  {
    return GetNumberOfRows_10();
  }

  private native void SetNumberOfRows_11(long id0);
  public void SetNumberOfRows(long id0)
  {
    SetNumberOfRows_11(id0);
  }

  private native void SqueezeRows_12();
  public void SqueezeRows()
  {
    SqueezeRows_12();
  }

  private native long GetRow_13(long id0);
  public vtkVariantArray GetRow(long id0)
  {
    long temp = GetRow_13(id0);

    if (temp == 0) return null;
    return (vtkVariantArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetRow_14(long id0,vtkVariantArray id1);
  public void GetRow(long id0,vtkVariantArray id1)
  {
    GetRow_14(id0,id1);
  }

  private native void SetRow_15(long id0,vtkVariantArray id1);
  public void SetRow(long id0,vtkVariantArray id1)
  {
    SetRow_15(id0,id1);
  }

  private native void InsertRow_16(long id0);
  public void InsertRow(long id0)
  {
    InsertRow_16(id0);
  }

  private native void InsertRows_17(long id0,long id1);
  public void InsertRows(long id0,long id1)
  {
    InsertRows_17(id0,id1);
  }

  private native long InsertNextBlankRow_18(double id0);
  public long InsertNextBlankRow(double id0)
  {
    return InsertNextBlankRow_18(id0);
  }

  private native long InsertNextRow_19(vtkVariantArray id0);
  public long InsertNextRow(vtkVariantArray id0)
  {
    return InsertNextRow_19(id0);
  }

  private native void RemoveRow_20(long id0);
  public void RemoveRow(long id0)
  {
    RemoveRow_20(id0);
  }

  private native void RemoveRows_21(long id0,long id1);
  public void RemoveRows(long id0,long id1)
  {
    RemoveRows_21(id0,id1);
  }

  private native void RemoveAllRows_22();
  public void RemoveAllRows()
  {
    RemoveAllRows_22();
  }

  private native long GetNumberOfColumns_23();
  public long GetNumberOfColumns()
  {
    return GetNumberOfColumns_23();
  }

  private native byte[] GetColumnName_24(long id0);
  public String GetColumnName(long id0)
  {
    return new String(GetColumnName_24(id0), StandardCharsets.UTF_8);
  }

  private native long GetColumnByName_25(byte[] id0, int len0);
  public vtkAbstractArray GetColumnByName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetColumnByName_25(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColumnIndex_26(byte[] id0, int len0);
  public long GetColumnIndex(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetColumnIndex_26(bytes0, bytes0.length);
  }

  private native long GetColumn_27(long id0);
  public vtkAbstractArray GetColumn(long id0)
  {
    long temp = GetColumn_27(id0);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddColumn_28(vtkAbstractArray id0);
  public void AddColumn(vtkAbstractArray id0)
  {
    AddColumn_28(id0);
  }

  private native void InsertColumn_29(vtkAbstractArray id0,long id1);
  public void InsertColumn(vtkAbstractArray id0,long id1)
  {
    InsertColumn_29(id0,id1);
  }

  private native void RemoveColumnByName_30(byte[] id0, int len0);
  public void RemoveColumnByName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveColumnByName_30(bytes0, bytes0.length);
  }

  private native void RemoveColumn_31(long id0);
  public void RemoveColumn(long id0)
  {
    RemoveColumn_31(id0);
  }

  private native void RemoveAllColumns_32();
  public void RemoveAllColumns()
  {
    RemoveAllColumns_32();
  }

  private native void Initialize_33();
  public void Initialize()
  {
    Initialize_33();
  }

  private native long GetData_34(vtkInformation id0);
  public vtkTable GetData(vtkInformation id0)
  {
    long temp = GetData_34(id0);

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_35(vtkInformationVector id0,int id1);
  public vtkTable GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_35(id0,id1);

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_36(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_36(id0);
  }

  private native void DeepCopy_37(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_37(id0);
  }

  private native long GetAttributesAsFieldData_38(int id0);
  public vtkFieldData GetAttributesAsFieldData(int id0)
  {
    long temp = GetAttributesAsFieldData_38(id0);

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfElements_39(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_39(id0);
  }

  public vtkTable() { super(); }

  public vtkTable(long id) { super(id); }
  public native long   VTKInit();

}
