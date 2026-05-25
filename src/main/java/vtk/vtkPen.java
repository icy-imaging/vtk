// java wrapper for vtkPen object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPen extends vtkObject
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

  private native void SetLineType_4(int id0);
  public void SetLineType(int id0)
  {
    SetLineType_4(id0);
  }

  private native int GetLineType_5();
  public int GetLineType()
  {
    return GetLineType_5();
  }

  private native void SetColorF_6(double id0[]);
  public void SetColorF(double id0[])
  {
    SetColorF_6(id0);
  }

  private native void SetColorF_7(double id0,double id1,double id2);
  public void SetColorF(double id0,double id1,double id2)
  {
    SetColorF_7(id0,id1,id2);
  }

  private native void SetColorF_8(double id0,double id1,double id2,double id3);
  public void SetColorF(double id0,double id1,double id2,double id3)
  {
    SetColorF_8(id0,id1,id2,id3);
  }

  private native void SetOpacityF_9(double id0);
  public void SetOpacityF(double id0)
  {
    SetOpacityF_9(id0);
  }

  private native void SetColor_10(byte id0,byte id1,byte id2);
  public void SetColor(byte id0,byte id1,byte id2)
  {
    SetColor_10(id0,id1,id2);
  }

  private native void SetColor_11(byte id0,byte id1,byte id2,byte id3);
  public void SetColor(byte id0,byte id1,byte id2,byte id3)
  {
    SetColor_11(id0,id1,id2,id3);
  }

  private native void SetOpacity_12(byte id0);
  public void SetOpacity(byte id0)
  {
    SetOpacity_12(id0);
  }

  private native void GetColorF_13(double id0[]);
  public void GetColorF(double id0[])
  {
    GetColorF_13(id0);
  }

  private native byte GetOpacity_14();
  public byte GetOpacity()
  {
    return GetOpacity_14();
  }

  private native void SetWidth_15(float id0);
  public void SetWidth(float id0)
  {
    SetWidth_15(id0);
  }

  private native float GetWidth_16();
  public float GetWidth()
  {
    return GetWidth_16();
  }

  private native void DeepCopy_17(vtkPen id0);
  public void DeepCopy(vtkPen id0)
  {
    DeepCopy_17(id0);
  }

  public vtkPen() { super(); }

  public vtkPen(long id) { super(id); }
  public native long   VTKInit();

}
