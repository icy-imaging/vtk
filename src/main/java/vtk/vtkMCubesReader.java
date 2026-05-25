// java wrapper for vtkMCubesReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMCubesReader extends vtkPolyDataAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetLimitsFileName_6(byte[] id0, int len0);
  public void SetLimitsFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLimitsFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetLimitsFileName_7();
  public String GetLimitsFileName()
  {
    return new String(GetLimitsFileName_7(), StandardCharsets.UTF_8);
  }

  private native void SetHeaderSize_8(int id0);
  public void SetHeaderSize(int id0)
  {
    SetHeaderSize_8(id0);
  }

  private native int GetHeaderSizeMinValue_9();
  public int GetHeaderSizeMinValue()
  {
    return GetHeaderSizeMinValue_9();
  }

  private native int GetHeaderSizeMaxValue_10();
  public int GetHeaderSizeMaxValue()
  {
    return GetHeaderSizeMaxValue_10();
  }

  private native int GetHeaderSize_11();
  public int GetHeaderSize()
  {
    return GetHeaderSize_11();
  }

  private native void SetFlipNormals_12(int id0);
  public void SetFlipNormals(int id0)
  {
    SetFlipNormals_12(id0);
  }

  private native int GetFlipNormals_13();
  public int GetFlipNormals()
  {
    return GetFlipNormals_13();
  }

  private native void FlipNormalsOn_14();
  public void FlipNormalsOn()
  {
    FlipNormalsOn_14();
  }

  private native void FlipNormalsOff_15();
  public void FlipNormalsOff()
  {
    FlipNormalsOff_15();
  }

  private native void SetNormals_16(int id0);
  public void SetNormals(int id0)
  {
    SetNormals_16(id0);
  }

  private native int GetNormals_17();
  public int GetNormals()
  {
    return GetNormals_17();
  }

  private native void NormalsOn_18();
  public void NormalsOn()
  {
    NormalsOn_18();
  }

  private native void NormalsOff_19();
  public void NormalsOff()
  {
    NormalsOff_19();
  }

  private native void SetDataByteOrderToBigEndian_20();
  public void SetDataByteOrderToBigEndian()
  {
    SetDataByteOrderToBigEndian_20();
  }

  private native void SetDataByteOrderToLittleEndian_21();
  public void SetDataByteOrderToLittleEndian()
  {
    SetDataByteOrderToLittleEndian_21();
  }

  private native int GetDataByteOrder_22();
  public int GetDataByteOrder()
  {
    return GetDataByteOrder_22();
  }

  private native void SetDataByteOrder_23(int id0);
  public void SetDataByteOrder(int id0)
  {
    SetDataByteOrder_23(id0);
  }

  private native byte[] GetDataByteOrderAsString_24();
  public String GetDataByteOrderAsString()
  {
    return new String(GetDataByteOrderAsString_24(), StandardCharsets.UTF_8);
  }

  private native void SetSwapBytes_25(int id0);
  public void SetSwapBytes(int id0)
  {
    SetSwapBytes_25(id0);
  }

  private native int GetSwapBytes_26();
  public int GetSwapBytes()
  {
    return GetSwapBytes_26();
  }

  private native void SwapBytesOn_27();
  public void SwapBytesOn()
  {
    SwapBytesOn_27();
  }

  private native void SwapBytesOff_28();
  public void SwapBytesOff()
  {
    SwapBytesOff_28();
  }

  private native void SetLocator_29(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_29(id0);
  }

  private native long GetLocator_30();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_30();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_31();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_31();
  }

  private native long GetMTime_32();
  public long GetMTime()
  {
    return GetMTime_32();
  }

  public vtkMCubesReader() { super(); }

  public vtkMCubesReader(long id) { super(id); }
  public native long   VTKInit();

}
