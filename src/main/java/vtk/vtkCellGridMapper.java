// java wrapper for vtkCellGridMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridMapper extends vtkMapper
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

  private native void SetVisualizePCoords_4(int id0);
  public void SetVisualizePCoords(int id0)
  {
    SetVisualizePCoords_4(id0);
  }

  private native int GetVisualizePCoords_5();
  public int GetVisualizePCoords()
  {
    return GetVisualizePCoords_5();
  }

  private native void SetVisualizeBasisFunction_6(int id0);
  public void SetVisualizeBasisFunction(int id0)
  {
    SetVisualizeBasisFunction_6(id0);
  }

  private native int GetVisualizeBasisFunction_7();
  public int GetVisualizeBasisFunction()
  {
    return GetVisualizeBasisFunction_7();
  }

  private native void Render_8(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_8(id0,id1);
  }

  private native void SetInputData_9(vtkCellGrid id0);
  public void SetInputData(vtkCellGrid id0)
  {
    SetInputData_9(id0);
  }

  private native long GetInput_10();
  public vtkCellGrid GetInput()
  {
    long temp = GetInput_10();

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_11(int id0);
  public void Update(int id0)
  {
    Update_11(id0);
  }

  private native void Update_12();
  public void Update()
  {
    Update_12();
  }

  private native int Update_13(int id0,vtkInformationVector id1);
  public int Update(int id0,vtkInformationVector id1)
  {
    return Update_13(id0,id1);
  }

  private native int Update_14(vtkInformation id0);
  public int Update(vtkInformation id0)
  {
    return Update_14(id0);
  }

  private native void PrepareColormap_15(vtkScalarsToColors id0);
  public void PrepareColormap(vtkScalarsToColors id0)
  {
    PrepareColormap_15(id0);
  }

  private native double[] GetBounds_16();
  public double[] GetBounds()
  {
    return GetBounds_16();
  }

  private native void GetBounds_17(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_17(id0);
  }

  private native boolean HasTranslucentPolygonalGeometry_18();
  public boolean HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_18();
  }

  public vtkCellGridMapper() { super(); }

  public vtkCellGridMapper(long id) { super(id); }
  public native long   VTKInit();

}
