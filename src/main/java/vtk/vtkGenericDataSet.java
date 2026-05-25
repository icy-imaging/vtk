// java wrapper for vtkGenericDataSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericDataSet extends vtkDataObject
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

  private native long GetNumberOfPoints_4();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_4();
  }

  private native long GetNumberOfCells_5(int id0);
  public long GetNumberOfCells(int id0)
  {
    return GetNumberOfCells_5(id0);
  }

  private native long GetNumberOfElements_6(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_6(id0);
  }

  private native int GetCellDimension_7();
  public int GetCellDimension()
  {
    return GetCellDimension_7();
  }

  private native void GetCellTypes_8(vtkCellTypes id0);
  public void GetCellTypes(vtkCellTypes id0)
  {
    GetCellTypes_8(id0);
  }

  private native long NewCellIterator_9(int id0);
  public vtkGenericCellIterator NewCellIterator(int id0)
  {
    long temp = NewCellIterator_9(id0);

    if (temp == 0) return null;
    return (vtkGenericCellIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long NewBoundaryIterator_10(int id0,int id1);
  public vtkGenericCellIterator NewBoundaryIterator(int id0,int id1)
  {
    long temp = NewBoundaryIterator_10(id0,id1);

    if (temp == 0) return null;
    return (vtkGenericCellIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long NewPointIterator_11();
  public vtkGenericPointIterator NewPointIterator()
  {
    long temp = NewPointIterator_11();

    if (temp == 0) return null;
    return (vtkGenericPointIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void FindPoint_12(double id0[],vtkGenericPointIterator id1);
  public void FindPoint(double id0[],vtkGenericPointIterator id1)
  {
    FindPoint_12(id0,id1);
  }

  private native long GetMTime_13();
  public long GetMTime()
  {
    return GetMTime_13();
  }

  private native void ComputeBounds_14();
  public void ComputeBounds()
  {
    ComputeBounds_14();
  }

  private native void GetBounds_15(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_15(id0);
  }

  private native void GetCenter_16(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_16(id0);
  }

  private native double GetLength_17();
  public double GetLength()
  {
    return GetLength_17();
  }

  private native long GetAttributes_18();
  public vtkGenericAttributeCollection GetAttributes()
  {
    long temp = GetAttributes_18();

    if (temp == 0) return null;
    return (vtkGenericAttributeCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAttributes_19(int id0);
  public vtkDataSetAttributes GetAttributes(int id0)
  {
    long temp = GetAttributes_19(id0);

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTessellator_20(vtkGenericCellTessellator id0);
  public void SetTessellator(vtkGenericCellTessellator id0)
  {
    SetTessellator_20(id0);
  }

  private native long GetTessellator_21();
  public vtkGenericCellTessellator GetTessellator()
  {
    long temp = GetTessellator_21();

    if (temp == 0) return null;
    return (vtkGenericCellTessellator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActualMemorySize_22();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_22();
  }

  private native int GetDataObjectType_23();
  public int GetDataObjectType()
  {
    return GetDataObjectType_23();
  }

  private native long GetEstimatedSize_24();
  public long GetEstimatedSize()
  {
    return GetEstimatedSize_24();
  }

  private native long GetData_25(vtkInformation id0);
  public vtkGenericDataSet GetData(vtkInformation id0)
  {
    long temp = GetData_25(id0);

    if (temp == 0) return null;
    return (vtkGenericDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_26(vtkInformationVector id0,int id1);
  public vtkGenericDataSet GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_26(id0,id1);

    if (temp == 0) return null;
    return (vtkGenericDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGenericDataSet() { super(); }

  public vtkGenericDataSet(long id) { super(id); }

}
