// java wrapper for vtkBrush object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBrush extends vtkObject
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

  private native void SetColorF_4(double id0[]);
  public void SetColorF(double id0[])
  {
    SetColorF_4(id0);
  }

  private native void SetColorF_5(double id0,double id1,double id2);
  public void SetColorF(double id0,double id1,double id2)
  {
    SetColorF_5(id0,id1,id2);
  }

  private native void SetColorF_6(double id0,double id1,double id2,double id3);
  public void SetColorF(double id0,double id1,double id2,double id3)
  {
    SetColorF_6(id0,id1,id2,id3);
  }

  private native void SetOpacityF_7(double id0);
  public void SetOpacityF(double id0)
  {
    SetOpacityF_7(id0);
  }

  private native double GetOpacityF_8();
  public double GetOpacityF()
  {
    return GetOpacityF_8();
  }

  private native void SetColor_9(byte id0,byte id1,byte id2);
  public void SetColor(byte id0,byte id1,byte id2)
  {
    SetColor_9(id0,id1,id2);
  }

  private native void SetColor_10(byte id0,byte id1,byte id2,byte id3);
  public void SetColor(byte id0,byte id1,byte id2,byte id3)
  {
    SetColor_10(id0,id1,id2,id3);
  }

  private native void SetOpacity_11(byte id0);
  public void SetOpacity(byte id0)
  {
    SetOpacity_11(id0);
  }

  private native byte GetOpacity_12();
  public byte GetOpacity()
  {
    return GetOpacity_12();
  }

  private native void GetColorF_13(double id0[]);
  public void GetColorF(double id0[])
  {
    GetColorF_13(id0);
  }

  private native void SetTexture_14(vtkImageData id0);
  public void SetTexture(vtkImageData id0)
  {
    SetTexture_14(id0);
  }

  private native long GetTexture_15();
  public vtkImageData GetTexture()
  {
    long temp = GetTexture_15();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTextureProperties_16(int id0);
  public void SetTextureProperties(int id0)
  {
    SetTextureProperties_16(id0);
  }

  private native int GetTextureProperties_17();
  public int GetTextureProperties()
  {
    return GetTextureProperties_17();
  }

  private native void DeepCopy_18(vtkBrush id0);
  public void DeepCopy(vtkBrush id0)
  {
    DeepCopy_18(id0);
  }

  public vtkBrush() { super(); }

  public vtkBrush(long id) { super(id); }
  public native long   VTKInit();

}
