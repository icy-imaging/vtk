// java wrapper for vtkCellIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellIterator extends vtkObject
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

  private native void InitTraversal_4();
  public void InitTraversal()
  {
    InitTraversal_4();
  }

  private native void GoToNextCell_5();
  public void GoToNextCell()
  {
    GoToNextCell_5();
  }

  private native boolean IsDoneWithTraversal_6();
  public boolean IsDoneWithTraversal()
  {
    return IsDoneWithTraversal_6();
  }

  private native int GetCellType_7();
  public int GetCellType()
  {
    return GetCellType_7();
  }

  private native int GetCellDimension_8();
  public int GetCellDimension()
  {
    return GetCellDimension_8();
  }

  private native long GetCellId_9();
  public long GetCellId()
  {
    return GetCellId_9();
  }

  private native long GetPointIds_10();
  public vtkIdList GetPointIds()
  {
    long temp = GetPointIds_10();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoints_11();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_11();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellFaces_12();
  public vtkCellArray GetCellFaces()
  {
    long temp = GetCellFaces_12();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSerializedCellFaces_13();
  public vtkIdList GetSerializedCellFaces()
  {
    long temp = GetSerializedCellFaces_13();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaces_14();
  public vtkIdList GetFaces()
  {
    long temp = GetFaces_14();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_15(vtkGenericCell id0);
  public void GetCell(vtkGenericCell id0)
  {
    GetCell_15(id0);
  }

  private native long GetNumberOfPoints_16();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_16();
  }

  private native long GetNumberOfFaces_17();
  public long GetNumberOfFaces()
  {
    return GetNumberOfFaces_17();
  }

  public vtkCellIterator() { super(); }

  public vtkCellIterator(long id) { super(id); }

}
