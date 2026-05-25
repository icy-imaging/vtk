// java wrapper for vtkCompositeDataDisplayAttributesLegacy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeDataDisplayAttributesLegacy extends vtkObject
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

  private native boolean HasBlockVisibilities_4();
  public boolean HasBlockVisibilities()
  {
    return HasBlockVisibilities_4();
  }

  private native void SetBlockVisibility_5(int id0,boolean id1);
  public void SetBlockVisibility(int id0,boolean id1)
  {
    SetBlockVisibility_5(id0,id1);
  }

  private native boolean GetBlockVisibility_6(int id0);
  public boolean GetBlockVisibility(int id0)
  {
    return GetBlockVisibility_6(id0);
  }

  private native boolean HasBlockVisibility_7(int id0);
  public boolean HasBlockVisibility(int id0)
  {
    return HasBlockVisibility_7(id0);
  }

  private native void RemoveBlockVisibility_8(int id0);
  public void RemoveBlockVisibility(int id0)
  {
    RemoveBlockVisibility_8(id0);
  }

  private native void RemoveBlockVisibilities_9();
  public void RemoveBlockVisibilities()
  {
    RemoveBlockVisibilities_9();
  }

  private native boolean HasBlockPickabilities_10();
  public boolean HasBlockPickabilities()
  {
    return HasBlockPickabilities_10();
  }

  private native void SetBlockPickability_11(int id0,boolean id1);
  public void SetBlockPickability(int id0,boolean id1)
  {
    SetBlockPickability_11(id0,id1);
  }

  private native boolean GetBlockPickability_12(int id0);
  public boolean GetBlockPickability(int id0)
  {
    return GetBlockPickability_12(id0);
  }

  private native boolean HasBlockPickability_13(int id0);
  public boolean HasBlockPickability(int id0)
  {
    return HasBlockPickability_13(id0);
  }

  private native void RemoveBlockPickability_14(int id0);
  public void RemoveBlockPickability(int id0)
  {
    RemoveBlockPickability_14(id0);
  }

  private native void RemoveBlockPickabilities_15();
  public void RemoveBlockPickabilities()
  {
    RemoveBlockPickabilities_15();
  }

  private native void SetBlockColor_16(int id0,double id1[]);
  public void SetBlockColor(int id0,double id1[])
  {
    SetBlockColor_16(id0,id1);
  }

  private native void GetBlockColor_17(int id0,double id1[]);
  public void GetBlockColor(int id0,double id1[])
  {
    GetBlockColor_17(id0,id1);
  }

  private native boolean HasBlockColors_18();
  public boolean HasBlockColors()
  {
    return HasBlockColors_18();
  }

  private native boolean HasBlockColor_19(int id0);
  public boolean HasBlockColor(int id0)
  {
    return HasBlockColor_19(id0);
  }

  private native void RemoveBlockColor_20(int id0);
  public void RemoveBlockColor(int id0)
  {
    RemoveBlockColor_20(id0);
  }

  private native void RemoveBlockColors_21();
  public void RemoveBlockColors()
  {
    RemoveBlockColors_21();
  }

  private native void SetBlockOpacity_22(int id0,double id1);
  public void SetBlockOpacity(int id0,double id1)
  {
    SetBlockOpacity_22(id0,id1);
  }

  private native double GetBlockOpacity_23(int id0);
  public double GetBlockOpacity(int id0)
  {
    return GetBlockOpacity_23(id0);
  }

  private native boolean HasBlockOpacities_24();
  public boolean HasBlockOpacities()
  {
    return HasBlockOpacities_24();
  }

  private native boolean HasBlockOpacity_25(int id0);
  public boolean HasBlockOpacity(int id0)
  {
    return HasBlockOpacity_25(id0);
  }

  private native void RemoveBlockOpacity_26(int id0);
  public void RemoveBlockOpacity(int id0)
  {
    RemoveBlockOpacity_26(id0);
  }

  private native void RemoveBlockOpacities_27();
  public void RemoveBlockOpacities()
  {
    RemoveBlockOpacities_27();
  }

  private native void ComputeVisibleBounds_28(vtkCompositeDataDisplayAttributesLegacy id0,vtkDataObject id1,double id2[]);
  public void ComputeVisibleBounds(vtkCompositeDataDisplayAttributesLegacy id0,vtkDataObject id1,double id2[])
  {
    ComputeVisibleBounds_28(id0,id1,id2);
  }

  public vtkCompositeDataDisplayAttributesLegacy() { super(); }

  public vtkCompositeDataDisplayAttributesLegacy(long id) { super(id); }
  public native long   VTKInit();

}
