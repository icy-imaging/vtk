// java wrapper for vtkTerrainDataPointPlacer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTerrainDataPointPlacer extends vtkPointPlacer
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

  private native void RemoveAllProps_5();
  public void RemoveAllProps()
  {
    RemoveAllProps_5();
  }

  private native void SetHeightOffset_6(double id0);
  public void SetHeightOffset(double id0)
  {
    SetHeightOffset_6(id0);
  }

  private native double GetHeightOffset_7();
  public double GetHeightOffset()
  {
    return GetHeightOffset_7();
  }

  private native int ComputeWorldPosition_8(vtkRenderer id0,double id1[],double id2[],double id3[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[])
  {
    return ComputeWorldPosition_8(id0,id1,id2,id3);
  }

  private native int ComputeWorldPosition_9(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[])
  {
    return ComputeWorldPosition_9(id0,id1,id2,id3,id4);
  }

  private native int ValidateWorldPosition_10(double id0[]);
  public int ValidateWorldPosition(double id0[])
  {
    return ValidateWorldPosition_10(id0);
  }

  private native int ValidateDisplayPosition_11(vtkRenderer id0,double id1[]);
  public int ValidateDisplayPosition(vtkRenderer id0,double id1[])
  {
    return ValidateDisplayPosition_11(id0,id1);
  }

  private native int ValidateWorldPosition_12(double id0[],double id1[]);
  public int ValidateWorldPosition(double id0[],double id1[])
  {
    return ValidateWorldPosition_12(id0,id1);
  }

  private native long GetPropPicker_13();
  public vtkPropPicker GetPropPicker()
  {
    long temp = GetPropPicker_13();

    if (temp == 0) return null;
    return (vtkPropPicker)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkTerrainDataPointPlacer() { super(); }

  public vtkTerrainDataPointPlacer(long id) { super(id); }
  public native long   VTKInit();

}
