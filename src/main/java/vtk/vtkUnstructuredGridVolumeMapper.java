// java wrapper for vtkUnstructuredGridVolumeMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridVolumeMapper extends vtkAbstractVolumeMapper
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

  private native void SetInputData_4(vtkUnstructuredGridBase id0);
  public void SetInputData(vtkUnstructuredGridBase id0)
  {
    SetInputData_4(id0);
  }

  private native void SetInputData_5(vtkDataSet id0);
  public void SetInputData(vtkDataSet id0)
  {
    SetInputData_5(id0);
  }

  private native long GetInput_6();
  public vtkUnstructuredGridBase GetInput()
  {
    long temp = GetInput_6();

    if (temp == 0) return null;
    return (vtkUnstructuredGridBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBlendMode_7(int id0);
  public void SetBlendMode(int id0)
  {
    SetBlendMode_7(id0);
  }

  private native void SetBlendModeToComposite_8();
  public void SetBlendModeToComposite()
  {
    SetBlendModeToComposite_8();
  }

  private native void SetBlendModeToMaximumIntensity_9();
  public void SetBlendModeToMaximumIntensity()
  {
    SetBlendModeToMaximumIntensity_9();
  }

  private native int GetBlendMode_10();
  public int GetBlendMode()
  {
    return GetBlendMode_10();
  }

  private native void Render_11(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_11(id0,id1);
  }

  private native void ReleaseGraphicsResources_12(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_12(id0);
  }

  public vtkUnstructuredGridVolumeMapper() { super(); }

  public vtkUnstructuredGridVolumeMapper(long id) { super(id); }

}
