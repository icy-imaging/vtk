// java wrapper for vtkFocalPlanePointPlacer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFocalPlanePointPlacer extends vtkPointPlacer
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

  private native int ComputeWorldPosition_4(vtkRenderer id0,double id1[],double id2[],double id3[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[])
  {
    return ComputeWorldPosition_4(id0,id1,id2,id3);
  }

  private native int ComputeWorldPosition_5(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[])
  {
    return ComputeWorldPosition_5(id0,id1,id2,id3,id4);
  }

  private native int ValidateWorldPosition_6(double id0[]);
  public int ValidateWorldPosition(double id0[])
  {
    return ValidateWorldPosition_6(id0);
  }

  private native int ValidateWorldPosition_7(double id0[],double id1[]);
  public int ValidateWorldPosition(double id0[],double id1[])
  {
    return ValidateWorldPosition_7(id0,id1);
  }

  private native void SetOffset_8(double id0);
  public void SetOffset(double id0)
  {
    SetOffset_8(id0);
  }

  private native double GetOffset_9();
  public double GetOffset()
  {
    return GetOffset_9();
  }

  private native void SetPointBounds_10(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetPointBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetPointBounds_10(id0,id1,id2,id3,id4,id5);
  }

  private native void SetPointBounds_11(double id0[]);
  public void SetPointBounds(double id0[])
  {
    SetPointBounds_11(id0);
  }

  private native double[] GetPointBounds_12();
  public double[] GetPointBounds()
  {
    return GetPointBounds_12();
  }

  public vtkFocalPlanePointPlacer() { super(); }

  public vtkFocalPlanePointPlacer(long id) { super(id); }
  public native long   VTKInit();

}
