// java wrapper for vtkBooleanTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBooleanTexture extends vtkImageAlgorithm
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

  private native void SetXSize_4(int id0);
  public void SetXSize(int id0)
  {
    SetXSize_4(id0);
  }

  private native int GetXSize_5();
  public int GetXSize()
  {
    return GetXSize_5();
  }

  private native void SetYSize_6(int id0);
  public void SetYSize(int id0)
  {
    SetYSize_6(id0);
  }

  private native int GetYSize_7();
  public int GetYSize()
  {
    return GetYSize_7();
  }

  private native void SetThickness_8(int id0);
  public void SetThickness(int id0)
  {
    SetThickness_8(id0);
  }

  private native int GetThickness_9();
  public int GetThickness()
  {
    return GetThickness_9();
  }

  private native void SetInIn_10(byte id0,byte id1);
  public void SetInIn(byte id0,byte id1)
  {
    SetInIn_10(id0,id1);
  }

  private native byte[]  GetInIn_11();
  public byte[]  GetInIn()
  {
    return GetInIn_11();
  }

  private native void SetInOut_12(byte id0,byte id1);
  public void SetInOut(byte id0,byte id1)
  {
    SetInOut_12(id0,id1);
  }

  private native byte[]  GetInOut_13();
  public byte[]  GetInOut()
  {
    return GetInOut_13();
  }

  private native void SetOutIn_14(byte id0,byte id1);
  public void SetOutIn(byte id0,byte id1)
  {
    SetOutIn_14(id0,id1);
  }

  private native byte[]  GetOutIn_15();
  public byte[]  GetOutIn()
  {
    return GetOutIn_15();
  }

  private native void SetOutOut_16(byte id0,byte id1);
  public void SetOutOut(byte id0,byte id1)
  {
    SetOutOut_16(id0,id1);
  }

  private native byte[]  GetOutOut_17();
  public byte[]  GetOutOut()
  {
    return GetOutOut_17();
  }

  private native void SetOnOn_18(byte id0,byte id1);
  public void SetOnOn(byte id0,byte id1)
  {
    SetOnOn_18(id0,id1);
  }

  private native byte[]  GetOnOn_19();
  public byte[]  GetOnOn()
  {
    return GetOnOn_19();
  }

  private native void SetOnIn_20(byte id0,byte id1);
  public void SetOnIn(byte id0,byte id1)
  {
    SetOnIn_20(id0,id1);
  }

  private native byte[]  GetOnIn_21();
  public byte[]  GetOnIn()
  {
    return GetOnIn_21();
  }

  private native void SetOnOut_22(byte id0,byte id1);
  public void SetOnOut(byte id0,byte id1)
  {
    SetOnOut_22(id0,id1);
  }

  private native byte[]  GetOnOut_23();
  public byte[]  GetOnOut()
  {
    return GetOnOut_23();
  }

  private native void SetInOn_24(byte id0,byte id1);
  public void SetInOn(byte id0,byte id1)
  {
    SetInOn_24(id0,id1);
  }

  private native byte[]  GetInOn_25();
  public byte[]  GetInOn()
  {
    return GetInOn_25();
  }

  private native void SetOutOn_26(byte id0,byte id1);
  public void SetOutOn(byte id0,byte id1)
  {
    SetOutOn_26(id0,id1);
  }

  private native byte[]  GetOutOn_27();
  public byte[]  GetOutOn()
  {
    return GetOutOn_27();
  }

  public vtkBooleanTexture() { super(); }

  public vtkBooleanTexture(long id) { super(id); }
  public native long   VTKInit();

}
