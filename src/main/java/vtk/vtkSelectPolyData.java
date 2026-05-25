// java wrapper for vtkSelectPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSelectPolyData extends vtkPolyDataAlgorithm
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

  private native void SetGenerateSelectionScalars_4(int id0);
  public void SetGenerateSelectionScalars(int id0)
  {
    SetGenerateSelectionScalars_4(id0);
  }

  private native int GetGenerateSelectionScalars_5();
  public int GetGenerateSelectionScalars()
  {
    return GetGenerateSelectionScalars_5();
  }

  private native void GenerateSelectionScalarsOn_6();
  public void GenerateSelectionScalarsOn()
  {
    GenerateSelectionScalarsOn_6();
  }

  private native void GenerateSelectionScalarsOff_7();
  public void GenerateSelectionScalarsOff()
  {
    GenerateSelectionScalarsOff_7();
  }

  private native void SetSelectionScalarsArrayName_8(byte[] id0, int len0);
  public void SetSelectionScalarsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSelectionScalarsArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetSelectionScalarsArrayName_9();
  public String GetSelectionScalarsArrayName()
  {
    return new String(GetSelectionScalarsArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetInsideOut_10(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_10(id0);
  }

  private native int GetInsideOut_11();
  public int GetInsideOut()
  {
    return GetInsideOut_11();
  }

  private native void InsideOutOn_12();
  public void InsideOutOn()
  {
    InsideOutOn_12();
  }

  private native void InsideOutOff_13();
  public void InsideOutOff()
  {
    InsideOutOff_13();
  }

  private native void SetEdgeSearchMode_14(int id0);
  public void SetEdgeSearchMode(int id0)
  {
    SetEdgeSearchMode_14(id0);
  }

  private native int GetEdgeSearchModeMinValue_15();
  public int GetEdgeSearchModeMinValue()
  {
    return GetEdgeSearchModeMinValue_15();
  }

  private native int GetEdgeSearchModeMaxValue_16();
  public int GetEdgeSearchModeMaxValue()
  {
    return GetEdgeSearchModeMaxValue_16();
  }

  private native int GetEdgeSearchMode_17();
  public int GetEdgeSearchMode()
  {
    return GetEdgeSearchMode_17();
  }

  private native void SetEdgeSearchModeToGreedy_18();
  public void SetEdgeSearchModeToGreedy()
  {
    SetEdgeSearchModeToGreedy_18();
  }

  private native void SetEdgeSearchModeToDijkstra_19();
  public void SetEdgeSearchModeToDijkstra()
  {
    SetEdgeSearchModeToDijkstra_19();
  }

  private native byte[] GetEdgeSearchModeAsString_20();
  public String GetEdgeSearchModeAsString()
  {
    return new String(GetEdgeSearchModeAsString_20(), StandardCharsets.UTF_8);
  }

  private native void SetLoop_21(vtkPoints id0);
  public void SetLoop(vtkPoints id0)
  {
    SetLoop_21(id0);
  }

  private native long GetLoop_22();
  public vtkPoints GetLoop()
  {
    long temp = GetLoop_22();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetClosestPoint_23(double id0,double id1,double id2);
  public void SetClosestPoint(double id0,double id1,double id2)
  {
    SetClosestPoint_23(id0,id1,id2);
  }

  private native void SetClosestPoint_24(double id0[]);
  public void SetClosestPoint(double id0[])
  {
    SetClosestPoint_24(id0);
  }

  private native double[] GetClosestPoint_25();
  public double[] GetClosestPoint()
  {
    return GetClosestPoint_25();
  }

  private native void SetSelectionMode_26(int id0);
  public void SetSelectionMode(int id0)
  {
    SetSelectionMode_26(id0);
  }

  private native int GetSelectionModeMinValue_27();
  public int GetSelectionModeMinValue()
  {
    return GetSelectionModeMinValue_27();
  }

  private native int GetSelectionModeMaxValue_28();
  public int GetSelectionModeMaxValue()
  {
    return GetSelectionModeMaxValue_28();
  }

  private native int GetSelectionMode_29();
  public int GetSelectionMode()
  {
    return GetSelectionMode_29();
  }

  private native void SetSelectionModeToSmallestRegion_30();
  public void SetSelectionModeToSmallestRegion()
  {
    SetSelectionModeToSmallestRegion_30();
  }

  private native void SetSelectionModeToLargestRegion_31();
  public void SetSelectionModeToLargestRegion()
  {
    SetSelectionModeToLargestRegion_31();
  }

  private native void SetSelectionModeToClosestPointRegion_32();
  public void SetSelectionModeToClosestPointRegion()
  {
    SetSelectionModeToClosestPointRegion_32();
  }

  private native byte[] GetSelectionModeAsString_33();
  public String GetSelectionModeAsString()
  {
    return new String(GetSelectionModeAsString_33(), StandardCharsets.UTF_8);
  }

  private native void SetGenerateUnselectedOutput_34(int id0);
  public void SetGenerateUnselectedOutput(int id0)
  {
    SetGenerateUnselectedOutput_34(id0);
  }

  private native int GetGenerateUnselectedOutput_35();
  public int GetGenerateUnselectedOutput()
  {
    return GetGenerateUnselectedOutput_35();
  }

  private native void GenerateUnselectedOutputOn_36();
  public void GenerateUnselectedOutputOn()
  {
    GenerateUnselectedOutputOn_36();
  }

  private native void GenerateUnselectedOutputOff_37();
  public void GenerateUnselectedOutputOff()
  {
    GenerateUnselectedOutputOff_37();
  }

  private native long GetUnselectedOutput_38();
  public vtkPolyData GetUnselectedOutput()
  {
    long temp = GetUnselectedOutput_38();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnselectedOutputPort_39();
  public vtkAlgorithmOutput GetUnselectedOutputPort()
  {
    long temp = GetUnselectedOutputPort_39();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectionEdges_40();
  public vtkPolyData GetSelectionEdges()
  {
    long temp = GetSelectionEdges_40();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_41();
  public long GetMTime()
  {
    return GetMTime_41();
  }

  public vtkSelectPolyData() { super(); }

  public vtkSelectPolyData(long id) { super(id); }
  public native long   VTKInit();

}
