// java wrapper for vtkNetCDFCAMReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNetCDFCAMReader extends vtkUnstructuredGridAlgorithm
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

  private native int CanReadFile_4(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_4(bytes0, bytes0.length);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_6();
  public String GetFileName()
  {
    return new String(GetFileName_6(), StandardCharsets.UTF_8);
  }

  private native void SetConnectivityFileName_7(byte[] id0, int len0);
  public void SetConnectivityFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetConnectivityFileName_7(bytes0, bytes0.length);
  }

  private native byte[] GetConnectivityFileName_8();
  public String GetConnectivityFileName()
  {
    return new String(GetConnectivityFileName_8(), StandardCharsets.UTF_8);
  }

  private native void SetVerticalDimension_9(int id0);
  public void SetVerticalDimension(int id0)
  {
    SetVerticalDimension_9(id0);
  }

  private native int GetVerticalDimensionMinValue_10();
  public int GetVerticalDimensionMinValue()
  {
    return GetVerticalDimensionMinValue_10();
  }

  private native int GetVerticalDimensionMaxValue_11();
  public int GetVerticalDimensionMaxValue()
  {
    return GetVerticalDimensionMaxValue_11();
  }

  private native int GetVerticalDimension_12();
  public int GetVerticalDimension()
  {
    return GetVerticalDimension_12();
  }

  private native void SingleMidpointLayerOn_13();
  public void SingleMidpointLayerOn()
  {
    SingleMidpointLayerOn_13();
  }

  private native void SingleMidpointLayerOff_14();
  public void SingleMidpointLayerOff()
  {
    SingleMidpointLayerOff_14();
  }

  private native void SetSingleMidpointLayer_15(int id0);
  public void SetSingleMidpointLayer(int id0)
  {
    SetSingleMidpointLayer_15(id0);
  }

  private native int GetSingleMidpointLayer_16();
  public int GetSingleMidpointLayer()
  {
    return GetSingleMidpointLayer_16();
  }

  private native void SetMidpointLayerIndex_17(int id0);
  public void SetMidpointLayerIndex(int id0)
  {
    SetMidpointLayerIndex_17(id0);
  }

  private native int GetMidpointLayerIndex_18();
  public int GetMidpointLayerIndex()
  {
    return GetMidpointLayerIndex_18();
  }

  private native int[] GetMidpointLayersRange_19();
  public int[] GetMidpointLayersRange()
  {
    return GetMidpointLayersRange_19();
  }

  private native void SingleInterfaceLayerOn_20();
  public void SingleInterfaceLayerOn()
  {
    SingleInterfaceLayerOn_20();
  }

  private native void SingleInterfaceLayerOff_21();
  public void SingleInterfaceLayerOff()
  {
    SingleInterfaceLayerOff_21();
  }

  private native void SetSingleInterfaceLayer_22(int id0);
  public void SetSingleInterfaceLayer(int id0)
  {
    SetSingleInterfaceLayer_22(id0);
  }

  private native int GetSingleInterfaceLayer_23();
  public int GetSingleInterfaceLayer()
  {
    return GetSingleInterfaceLayer_23();
  }

  private native void SetInterfaceLayerIndex_24(int id0);
  public void SetInterfaceLayerIndex(int id0)
  {
    SetInterfaceLayerIndex_24(id0);
  }

  private native int GetInterfaceLayerIndex_25();
  public int GetInterfaceLayerIndex()
  {
    return GetInterfaceLayerIndex_25();
  }

  private native int[] GetInterfaceLayersRange_26();
  public int[] GetInterfaceLayersRange()
  {
    return GetInterfaceLayersRange_26();
  }

  private native int GetNumberOfPointArrays_27();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_27();
  }

  private native byte[] GetPointArrayName_28(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_28(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_29(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_29(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_30(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_30(bytes0, bytes0.length,id1);
  }

  private native void DisableAllPointArrays_31();
  public void DisableAllPointArrays()
  {
    DisableAllPointArrays_31();
  }

  private native void EnableAllPointArrays_32();
  public void EnableAllPointArrays()
  {
    EnableAllPointArrays_32();
  }

  public vtkNetCDFCAMReader() { super(); }

  public vtkNetCDFCAMReader(long id) { super(id); }
  public native long   VTKInit();

}
