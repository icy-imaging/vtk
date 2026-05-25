// java wrapper for vtkVolume16Reader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolume16Reader extends vtkVolumeReader
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

  private native void SetDataDimensions_4(int id0,int id1);
  public void SetDataDimensions(int id0,int id1)
  {
    SetDataDimensions_4(id0,id1);
  }

  private native void SetDataDimensions_5(int id0[]);
  public void SetDataDimensions(int id0[])
  {
    SetDataDimensions_5(id0);
  }

  private native int[] GetDataDimensions_6();
  public int[] GetDataDimensions()
  {
    return GetDataDimensions_6();
  }

  private native void SetDataMask_7(short id0);
  public void SetDataMask(short id0)
  {
    SetDataMask_7(id0);
  }

  private native short GetDataMask_8();
  public short GetDataMask()
  {
    return GetDataMask_8();
  }

  private native void SetHeaderSize_9(int id0);
  public void SetHeaderSize(int id0)
  {
    SetHeaderSize_9(id0);
  }

  private native int GetHeaderSize_10();
  public int GetHeaderSize()
  {
    return GetHeaderSize_10();
  }

  private native void SetDataByteOrderToBigEndian_11();
  public void SetDataByteOrderToBigEndian()
  {
    SetDataByteOrderToBigEndian_11();
  }

  private native void SetDataByteOrderToLittleEndian_12();
  public void SetDataByteOrderToLittleEndian()
  {
    SetDataByteOrderToLittleEndian_12();
  }

  private native int GetDataByteOrder_13();
  public int GetDataByteOrder()
  {
    return GetDataByteOrder_13();
  }

  private native void SetDataByteOrder_14(int id0);
  public void SetDataByteOrder(int id0)
  {
    SetDataByteOrder_14(id0);
  }

  private native byte[] GetDataByteOrderAsString_15();
  public String GetDataByteOrderAsString()
  {
    return new String(GetDataByteOrderAsString_15(), StandardCharsets.UTF_8);
  }

  private native void SetSwapBytes_16(int id0);
  public void SetSwapBytes(int id0)
  {
    SetSwapBytes_16(id0);
  }

  private native int GetSwapBytes_17();
  public int GetSwapBytes()
  {
    return GetSwapBytes_17();
  }

  private native void SwapBytesOn_18();
  public void SwapBytesOn()
  {
    SwapBytesOn_18();
  }

  private native void SwapBytesOff_19();
  public void SwapBytesOff()
  {
    SwapBytesOff_19();
  }

  private native void SetTransform_20(vtkTransform id0);
  public void SetTransform(vtkTransform id0)
  {
    SetTransform_20(id0);
  }

  private native long GetTransform_21();
  public vtkTransform GetTransform()
  {
    long temp = GetTransform_21();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImage_22(int id0);
  public vtkImageData GetImage(int id0)
  {
    long temp = GetImage_22(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkVolume16Reader() { super(); }

  public vtkVolume16Reader(long id) { super(id); }
  public native long   VTKInit();

}
