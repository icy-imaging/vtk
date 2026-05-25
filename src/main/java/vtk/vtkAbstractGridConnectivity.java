// java wrapper for vtkAbstractGridConnectivity object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractGridConnectivity extends vtkObject
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

  private native void SetNumberOfGhostLayers_4(int id0);
  public void SetNumberOfGhostLayers(int id0)
  {
    SetNumberOfGhostLayers_4(id0);
  }

  private native int GetNumberOfGhostLayers_5();
  public int GetNumberOfGhostLayers()
  {
    return GetNumberOfGhostLayers_5();
  }

  private native void SetNumberOfGrids_6(int id0);
  public void SetNumberOfGrids(int id0)
  {
    SetNumberOfGrids_6(id0);
  }

  private native int GetNumberOfGrids_7();
  public int GetNumberOfGrids()
  {
    return GetNumberOfGrids_7();
  }

  private native void ComputeNeighbors_8();
  public void ComputeNeighbors()
  {
    ComputeNeighbors_8();
  }

  private native void CreateGhostLayers_9(int id0);
  public void CreateGhostLayers(int id0)
  {
    CreateGhostLayers_9(id0);
  }

  private native long GetGhostedPointGhostArray_10(int id0);
  public vtkUnsignedCharArray GetGhostedPointGhostArray(int id0)
  {
    long temp = GetGhostedPointGhostArray_10(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGhostedCellGhostArray_11(int id0);
  public vtkUnsignedCharArray GetGhostedCellGhostArray(int id0)
  {
    long temp = GetGhostedCellGhostArray_11(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGhostedGridPointData_12(int id0);
  public vtkPointData GetGhostedGridPointData(int id0)
  {
    long temp = GetGhostedGridPointData_12(id0);

    if (temp == 0) return null;
    return (vtkPointData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGhostedGridCellData_13(int id0);
  public vtkCellData GetGhostedGridCellData(int id0)
  {
    long temp = GetGhostedGridCellData_13(id0);

    if (temp == 0) return null;
    return (vtkCellData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGhostedPoints_14(int id0);
  public vtkPoints GetGhostedPoints(int id0)
  {
    long temp = GetGhostedPoints_14(id0);

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAbstractGridConnectivity() { super(); }

  public vtkAbstractGridConnectivity(long id) { super(id); }

}
