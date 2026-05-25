// java wrapper for vtkCellCentersPointPlacer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellCentersPointPlacer extends vtkPointPlacer
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

  private native void AddProp_4(vtkProp id0);
  public void AddProp(vtkProp id0)
  {
    AddProp_4(id0);
  }

  private native void RemoveViewProp_5(vtkProp id0);
  public void RemoveViewProp(vtkProp id0)
  {
    RemoveViewProp_5(id0);
  }

  private native void RemoveAllProps_6();
  public void RemoveAllProps()
  {
    RemoveAllProps_6();
  }

  private native int HasProp_7(vtkProp id0);
  public int HasProp(vtkProp id0)
  {
    return HasProp_7(id0);
  }

  private native int GetNumberOfProps_8();
  public int GetNumberOfProps()
  {
    return GetNumberOfProps_8();
  }

  private native int ComputeWorldPosition_9(vtkRenderer id0,double id1[],double id2[],double id3[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[])
  {
    return ComputeWorldPosition_9(id0,id1,id2,id3);
  }

  private native int ComputeWorldPosition_10(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[])
  {
    return ComputeWorldPosition_10(id0,id1,id2,id3,id4);
  }

  private native int ValidateWorldPosition_11(double id0[]);
  public int ValidateWorldPosition(double id0[])
  {
    return ValidateWorldPosition_11(id0);
  }

  private native int ValidateDisplayPosition_12(vtkRenderer id0,double id1[]);
  public int ValidateDisplayPosition(vtkRenderer id0,double id1[])
  {
    return ValidateDisplayPosition_12(id0,id1);
  }

  private native int ValidateWorldPosition_13(double id0[],double id1[]);
  public int ValidateWorldPosition(double id0[],double id1[])
  {
    return ValidateWorldPosition_13(id0,id1);
  }

  private native long GetCellPicker_14();
  public vtkCellPicker GetCellPicker()
  {
    long temp = GetCellPicker_14();

    if (temp == 0) return null;
    return (vtkCellPicker)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMode_15(int id0);
  public void SetMode(int id0)
  {
    SetMode_15(id0);
  }

  private native int GetMode_16();
  public int GetMode()
  {
    return GetMode_16();
  }

  public vtkCellCentersPointPlacer() { super(); }

  public vtkCellCentersPointPlacer(long id) { super(id); }
  public native long   VTKInit();

}
