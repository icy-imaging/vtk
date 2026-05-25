// java wrapper for vtkIconGlyphFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIconGlyphFilter extends vtkPolyDataAlgorithm
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

  private native void SetIconSize_4(int id0,int id1);
  public void SetIconSize(int id0,int id1)
  {
    SetIconSize_4(id0,id1);
  }

  private native void SetIconSize_5(int id0[]);
  public void SetIconSize(int id0[])
  {
    SetIconSize_5(id0);
  }

  private native int[] GetIconSize_6();
  public int[] GetIconSize()
  {
    return GetIconSize_6();
  }

  private native void SetIconSheetSize_7(int id0,int id1);
  public void SetIconSheetSize(int id0,int id1)
  {
    SetIconSheetSize_7(id0,id1);
  }

  private native void SetIconSheetSize_8(int id0[]);
  public void SetIconSheetSize(int id0[])
  {
    SetIconSheetSize_8(id0);
  }

  private native int[] GetIconSheetSize_9();
  public int[] GetIconSheetSize()
  {
    return GetIconSheetSize_9();
  }

  private native void SetDisplaySize_10(int id0,int id1);
  public void SetDisplaySize(int id0,int id1)
  {
    SetDisplaySize_10(id0,id1);
  }

  private native void SetDisplaySize_11(int id0[]);
  public void SetDisplaySize(int id0[])
  {
    SetDisplaySize_11(id0);
  }

  private native int[] GetDisplaySize_12();
  public int[] GetDisplaySize()
  {
    return GetDisplaySize_12();
  }

  private native void SetUseIconSize_13(boolean id0);
  public void SetUseIconSize(boolean id0)
  {
    SetUseIconSize_13(id0);
  }

  private native boolean GetUseIconSize_14();
  public boolean GetUseIconSize()
  {
    return GetUseIconSize_14();
  }

  private native void UseIconSizeOn_15();
  public void UseIconSizeOn()
  {
    UseIconSizeOn_15();
  }

  private native void UseIconSizeOff_16();
  public void UseIconSizeOff()
  {
    UseIconSizeOff_16();
  }

  private native void SetIconScaling_17(int id0);
  public void SetIconScaling(int id0)
  {
    SetIconScaling_17(id0);
  }

  private native int GetIconScaling_18();
  public int GetIconScaling()
  {
    return GetIconScaling_18();
  }

  private native void SetIconScalingToScalingOff_19();
  public void SetIconScalingToScalingOff()
  {
    SetIconScalingToScalingOff_19();
  }

  private native void SetIconScalingToScalingArray_20();
  public void SetIconScalingToScalingArray()
  {
    SetIconScalingToScalingArray_20();
  }

  private native void SetPassScalars_21(boolean id0);
  public void SetPassScalars(boolean id0)
  {
    SetPassScalars_21(id0);
  }

  private native boolean GetPassScalars_22();
  public boolean GetPassScalars()
  {
    return GetPassScalars_22();
  }

  private native void PassScalarsOn_23();
  public void PassScalarsOn()
  {
    PassScalarsOn_23();
  }

  private native void PassScalarsOff_24();
  public void PassScalarsOff()
  {
    PassScalarsOff_24();
  }

  private native void SetGravity_25(int id0);
  public void SetGravity(int id0)
  {
    SetGravity_25(id0);
  }

  private native int GetGravity_26();
  public int GetGravity()
  {
    return GetGravity_26();
  }

  private native void SetGravityToTopRight_27();
  public void SetGravityToTopRight()
  {
    SetGravityToTopRight_27();
  }

  private native void SetGravityToTopCenter_28();
  public void SetGravityToTopCenter()
  {
    SetGravityToTopCenter_28();
  }

  private native void SetGravityToTopLeft_29();
  public void SetGravityToTopLeft()
  {
    SetGravityToTopLeft_29();
  }

  private native void SetGravityToCenterRight_30();
  public void SetGravityToCenterRight()
  {
    SetGravityToCenterRight_30();
  }

  private native void SetGravityToCenterCenter_31();
  public void SetGravityToCenterCenter()
  {
    SetGravityToCenterCenter_31();
  }

  private native void SetGravityToCenterLeft_32();
  public void SetGravityToCenterLeft()
  {
    SetGravityToCenterLeft_32();
  }

  private native void SetGravityToBottomRight_33();
  public void SetGravityToBottomRight()
  {
    SetGravityToBottomRight_33();
  }

  private native void SetGravityToBottomCenter_34();
  public void SetGravityToBottomCenter()
  {
    SetGravityToBottomCenter_34();
  }

  private native void SetGravityToBottomLeft_35();
  public void SetGravityToBottomLeft()
  {
    SetGravityToBottomLeft_35();
  }

  private native void SetOffset_36(int id0,int id1);
  public void SetOffset(int id0,int id1)
  {
    SetOffset_36(id0,id1);
  }

  private native void SetOffset_37(int id0[]);
  public void SetOffset(int id0[])
  {
    SetOffset_37(id0);
  }

  private native int[] GetOffset_38();
  public int[] GetOffset()
  {
    return GetOffset_38();
  }

  public vtkIconGlyphFilter() { super(); }

  public vtkIconGlyphFilter(long id) { super(id); }
  public native long   VTKInit();

}
