// java wrapper for vtkEllipsoidTensorProbeRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEllipsoidTensorProbeRepresentation extends vtkTensorProbeRepresentation
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

  private native void BuildRepresentation_4();
  public void BuildRepresentation()
  {
    BuildRepresentation_4();
  }

  private native int RenderOpaqueGeometry_5(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_5(id0);
  }

  private native int SelectProbe_6(int id0[]);
  public int SelectProbe(int id0[])
  {
    return SelectProbe_6(id0);
  }

  private native void GetActors_7(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_7(id0);
  }

  private native void ReleaseGraphicsResources_8(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_8(id0);
  }

  private native void RegisterPickers_9();
  public void RegisterPickers()
  {
    RegisterPickers_9();
  }

  public vtkEllipsoidTensorProbeRepresentation() { super(); }

  public vtkEllipsoidTensorProbeRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
