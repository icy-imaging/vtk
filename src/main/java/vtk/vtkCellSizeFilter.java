// java wrapper for vtkCellSizeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellSizeFilter extends vtkPassInputTypeAlgorithm
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

  private native void SetComputeVertexCount_4(boolean id0);
  public void SetComputeVertexCount(boolean id0)
  {
    SetComputeVertexCount_4(id0);
  }

  private native boolean GetComputeVertexCount_5();
  public boolean GetComputeVertexCount()
  {
    return GetComputeVertexCount_5();
  }

  private native void ComputeVertexCountOn_6();
  public void ComputeVertexCountOn()
  {
    ComputeVertexCountOn_6();
  }

  private native void ComputeVertexCountOff_7();
  public void ComputeVertexCountOff()
  {
    ComputeVertexCountOff_7();
  }

  private native void SetComputeLength_8(boolean id0);
  public void SetComputeLength(boolean id0)
  {
    SetComputeLength_8(id0);
  }

  private native boolean GetComputeLength_9();
  public boolean GetComputeLength()
  {
    return GetComputeLength_9();
  }

  private native void ComputeLengthOn_10();
  public void ComputeLengthOn()
  {
    ComputeLengthOn_10();
  }

  private native void ComputeLengthOff_11();
  public void ComputeLengthOff()
  {
    ComputeLengthOff_11();
  }

  private native void SetComputeArea_12(boolean id0);
  public void SetComputeArea(boolean id0)
  {
    SetComputeArea_12(id0);
  }

  private native boolean GetComputeArea_13();
  public boolean GetComputeArea()
  {
    return GetComputeArea_13();
  }

  private native void ComputeAreaOn_14();
  public void ComputeAreaOn()
  {
    ComputeAreaOn_14();
  }

  private native void ComputeAreaOff_15();
  public void ComputeAreaOff()
  {
    ComputeAreaOff_15();
  }

  private native void SetComputeVolume_16(boolean id0);
  public void SetComputeVolume(boolean id0)
  {
    SetComputeVolume_16(id0);
  }

  private native boolean GetComputeVolume_17();
  public boolean GetComputeVolume()
  {
    return GetComputeVolume_17();
  }

  private native void ComputeVolumeOn_18();
  public void ComputeVolumeOn()
  {
    ComputeVolumeOn_18();
  }

  private native void ComputeVolumeOff_19();
  public void ComputeVolumeOff()
  {
    ComputeVolumeOff_19();
  }

  private native void SetComputeSum_20(boolean id0);
  public void SetComputeSum(boolean id0)
  {
    SetComputeSum_20(id0);
  }

  private native boolean GetComputeSum_21();
  public boolean GetComputeSum()
  {
    return GetComputeSum_21();
  }

  private native void ComputeSumOn_22();
  public void ComputeSumOn()
  {
    ComputeSumOn_22();
  }

  private native void ComputeSumOff_23();
  public void ComputeSumOff()
  {
    ComputeSumOff_23();
  }

  private native void SetVertexCountArrayName_24(byte[] id0, int len0);
  public void SetVertexCountArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexCountArrayName_24(bytes0, bytes0.length);
  }

  private native byte[] GetVertexCountArrayName_25();
  public String GetVertexCountArrayName()
  {
    return new String(GetVertexCountArrayName_25(), StandardCharsets.UTF_8);
  }

  private native void SetLengthArrayName_26(byte[] id0, int len0);
  public void SetLengthArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLengthArrayName_26(bytes0, bytes0.length);
  }

  private native byte[] GetLengthArrayName_27();
  public String GetLengthArrayName()
  {
    return new String(GetLengthArrayName_27(), StandardCharsets.UTF_8);
  }

  private native void SetAreaArrayName_28(byte[] id0, int len0);
  public void SetAreaArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaArrayName_28(bytes0, bytes0.length);
  }

  private native byte[] GetAreaArrayName_29();
  public String GetAreaArrayName()
  {
    return new String(GetAreaArrayName_29(), StandardCharsets.UTF_8);
  }

  private native void SetVolumeArrayName_30(byte[] id0, int len0);
  public void SetVolumeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVolumeArrayName_30(bytes0, bytes0.length);
  }

  private native byte[] GetVolumeArrayName_31();
  public String GetVolumeArrayName()
  {
    return new String(GetVolumeArrayName_31(), StandardCharsets.UTF_8);
  }

  public vtkCellSizeFilter() { super(); }

  public vtkCellSizeFilter(long id) { super(id); }
  public native long   VTKInit();

}
