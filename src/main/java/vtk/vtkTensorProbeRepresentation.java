// java wrapper for vtkTensorProbeRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTensorProbeRepresentation extends vtkWidgetRepresentation
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

  private native void SetProbePosition_6(double id0,double id1,double id2);
  public void SetProbePosition(double id0,double id1,double id2)
  {
    SetProbePosition_6(id0,id1,id2);
  }

  private native void SetProbePosition_7(double id0[]);
  public void SetProbePosition(double id0[])
  {
    SetProbePosition_7(id0);
  }

  private native double[] GetProbePosition_8();
  public double[] GetProbePosition()
  {
    return GetProbePosition_8();
  }

  private native void SetProbeCellId_9(long id0);
  public void SetProbeCellId(long id0)
  {
    SetProbeCellId_9(id0);
  }

  private native long GetProbeCellId_10();
  public long GetProbeCellId()
  {
    return GetProbeCellId_10();
  }

  private native void SetTrajectory_11(vtkPolyData id0);
  public void SetTrajectory(vtkPolyData id0)
  {
    SetTrajectory_11(id0);
  }

  private native void Initialize_12();
  public void Initialize()
  {
    Initialize_12();
  }

  private native int SelectProbe_13(int id0[]);
  public int SelectProbe(int id0[])
  {
    return SelectProbe_13(id0);
  }

  private native int Move_14(double id0[]);
  public int Move(double id0[])
  {
    return Move_14(id0);
  }

  private native void GetActors_15(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_15(id0);
  }

  private native void ReleaseGraphicsResources_16(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_16(id0);
  }

  public vtkTensorProbeRepresentation() { super(); }

  public vtkTensorProbeRepresentation(long id) { super(id); }

}
