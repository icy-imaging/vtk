// java wrapper for vtkLODActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLODActor extends vtkActor
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

  private native void Render_4(vtkRenderer id0,vtkMapper id1);
  public void Render(vtkRenderer id0,vtkMapper id1)
  {
    Render_4(id0,id1);
  }

  private native void ReleaseGraphicsResources_5(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_5(id0);
  }

  private native void AddLODMapper_6(vtkMapper id0);
  public void AddLODMapper(vtkMapper id0)
  {
    AddLODMapper_6(id0);
  }

  private native void SetLowResFilter_7(vtkPolyDataAlgorithm id0);
  public void SetLowResFilter(vtkPolyDataAlgorithm id0)
  {
    SetLowResFilter_7(id0);
  }

  private native void SetMediumResFilter_8(vtkPolyDataAlgorithm id0);
  public void SetMediumResFilter(vtkPolyDataAlgorithm id0)
  {
    SetMediumResFilter_8(id0);
  }

  private native long GetLowResFilter_9();
  public vtkPolyDataAlgorithm GetLowResFilter()
  {
    long temp = GetLowResFilter_9();

    if (temp == 0) return null;
    return (vtkPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMediumResFilter_10();
  public vtkPolyDataAlgorithm GetMediumResFilter()
  {
    long temp = GetMediumResFilter_10();

    if (temp == 0) return null;
    return (vtkPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfCloudPoints_11();
  public int GetNumberOfCloudPoints()
  {
    return GetNumberOfCloudPoints_11();
  }

  private native void SetNumberOfCloudPoints_12(int id0);
  public void SetNumberOfCloudPoints(int id0)
  {
    SetNumberOfCloudPoints_12(id0);
  }

  private native long GetLODMappers_13();
  public vtkMapperCollection GetLODMappers()
  {
    long temp = GetLODMappers_13();

    if (temp == 0) return null;
    return (vtkMapperCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Modified_14();
  public void Modified()
  {
    Modified_14();
  }

  private native void ShallowCopy_15(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_15(id0);
  }

  public vtkLODActor() { super(); }

  public vtkLODActor(long id) { super(id); }
  public native long   VTKInit();

}
