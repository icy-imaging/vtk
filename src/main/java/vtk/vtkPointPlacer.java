// java wrapper for vtkPointPlacer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointPlacer extends vtkObject
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

  private native int ValidateDisplayPosition_7(vtkRenderer id0,double id1[]);
  public int ValidateDisplayPosition(vtkRenderer id0,double id1[])
  {
    return ValidateDisplayPosition_7(id0,id1);
  }

  private native int ValidateWorldPosition_8(double id0[],double id1[]);
  public int ValidateWorldPosition(double id0[],double id1[])
  {
    return ValidateWorldPosition_8(id0,id1);
  }

  private native int UpdateWorldPosition_9(vtkRenderer id0,double id1[],double id2[]);
  public int UpdateWorldPosition(vtkRenderer id0,double id1[],double id2[])
  {
    return UpdateWorldPosition_9(id0,id1,id2);
  }

  private native int UpdateNodeWorldPosition_10(double id0[],long id1);
  public int UpdateNodeWorldPosition(double id0[],long id1)
  {
    return UpdateNodeWorldPosition_10(id0,id1);
  }

  private native int UpdateInternalState_11();
  public int UpdateInternalState()
  {
    return UpdateInternalState_11();
  }

  private native void SetPixelTolerance_12(int id0);
  public void SetPixelTolerance(int id0)
  {
    SetPixelTolerance_12(id0);
  }

  private native int GetPixelToleranceMinValue_13();
  public int GetPixelToleranceMinValue()
  {
    return GetPixelToleranceMinValue_13();
  }

  private native int GetPixelToleranceMaxValue_14();
  public int GetPixelToleranceMaxValue()
  {
    return GetPixelToleranceMaxValue_14();
  }

  private native int GetPixelTolerance_15();
  public int GetPixelTolerance()
  {
    return GetPixelTolerance_15();
  }

  private native void SetWorldTolerance_16(double id0);
  public void SetWorldTolerance(double id0)
  {
    SetWorldTolerance_16(id0);
  }

  private native double GetWorldToleranceMinValue_17();
  public double GetWorldToleranceMinValue()
  {
    return GetWorldToleranceMinValue_17();
  }

  private native double GetWorldToleranceMaxValue_18();
  public double GetWorldToleranceMaxValue()
  {
    return GetWorldToleranceMaxValue_18();
  }

  private native double GetWorldTolerance_19();
  public double GetWorldTolerance()
  {
    return GetWorldTolerance_19();
  }

  public vtkPointPlacer() { super(); }

  public vtkPointPlacer(long id) { super(id); }
  public native long   VTKInit();

}
