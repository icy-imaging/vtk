// java wrapper for vtkAMRSliceFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRSliceFilter extends vtkOverlappingAMRAlgorithm
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

  private native void SetOffsetFromOrigin_4(double id0);
  public void SetOffsetFromOrigin(double id0)
  {
    SetOffsetFromOrigin_4(id0);
  }

  private native double GetOffsetFromOrigin_5();
  public double GetOffsetFromOrigin()
  {
    return GetOffsetFromOrigin_5();
  }

  private native void SetMaxResolution_6(int id0);
  public void SetMaxResolution(int id0)
  {
    SetMaxResolution_6(id0);
  }

  private native int GetMaxResolution_7();
  public int GetMaxResolution()
  {
    return GetMaxResolution_7();
  }

  private native void SetNormal_8(int id0);
  public void SetNormal(int id0)
  {
    SetNormal_8(id0);
  }

  private native int GetNormal_9();
  public int GetNormal()
  {
    return GetNormal_9();
  }

  private native void SetController_10(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_10(id0);
  }

  private native long GetController_11();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_11();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int FillInputPortInformation_12(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_12(id0,id1);
  }

  private native int FillOutputPortInformation_13(int id0,vtkInformation id1);
  public int FillOutputPortInformation(int id0,vtkInformation id1)
  {
    return FillOutputPortInformation_13(id0,id1);
  }

  public vtkAMRSliceFilter() { super(); }

  public vtkAMRSliceFilter(long id) { super(id); }
  public native long   VTKInit();

}
