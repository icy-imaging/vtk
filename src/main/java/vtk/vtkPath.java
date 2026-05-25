// java wrapper for vtkPath object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPath extends vtkPointSet
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native void InsertNextPoint_5(float id0[],int id1);
  public void InsertNextPoint(float id0[],int id1)
  {
    InsertNextPoint_5(id0,id1);
  }

  private native void InsertNextPoint_6(double id0[],int id1);
  public void InsertNextPoint(double id0[],int id1)
  {
    InsertNextPoint_6(id0,id1);
  }

  private native void InsertNextPoint_7(double id0,double id1,double id2,int id3);
  public void InsertNextPoint(double id0,double id1,double id2,int id3)
  {
    InsertNextPoint_7(id0,id1,id2,id3);
  }

  private native void SetCodes_8(vtkIntArray id0);
  public void SetCodes(vtkIntArray id0)
  {
    SetCodes_8(id0);
  }

  private native long GetCodes_9();
  public vtkIntArray GetCodes()
  {
    long temp = GetCodes_9();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfCells_10();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_10();
  }

  private native long GetCell_11(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_11(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_12(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_12(id0,id1);
  }

  private native int GetCellType_13(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_13(id0);
  }

  private native void GetCellPoints_14(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_14(id0,id1);
  }

  private native void GetPointCells_15(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_15(id0,id1);
  }

  private native int GetMaxCellSize_16();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_16();
  }

  private native int GetMaxSpatialDimension_17();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_17();
  }

  private native void Allocate_18(long id0,int id1);
  public void Allocate(long id0,int id1)
  {
    Allocate_18(id0,id1);
  }

  private native void Reset_19();
  public void Reset()
  {
    Reset_19();
  }

  private native long GetData_20(vtkInformation id0);
  public vtkPath GetData(vtkInformation id0)
  {
    long temp = GetData_20(id0);

    if (temp == 0) return null;
    return (vtkPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_21(vtkInformationVector id0,int id1);
  public vtkPath GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_21(id0,id1);

    if (temp == 0) return null;
    return (vtkPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_22(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_22(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPath() { super(); }

  public vtkPath(long id) { super(id); }
  public native long   VTKInit();

}
