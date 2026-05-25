// java wrapper for vtkBinnedDecimation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBinnedDecimation extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfXDivisions_4(int id0);
  public void SetNumberOfXDivisions(int id0)
  {
    SetNumberOfXDivisions_4(id0);
  }

  private native void SetNumberOfYDivisions_5(int id0);
  public void SetNumberOfYDivisions(int id0)
  {
    SetNumberOfYDivisions_5(id0);
  }

  private native void SetNumberOfZDivisions_6(int id0);
  public void SetNumberOfZDivisions(int id0)
  {
    SetNumberOfZDivisions_6(id0);
  }

  private native int GetNumberOfXDivisions_7();
  public int GetNumberOfXDivisions()
  {
    return GetNumberOfXDivisions_7();
  }

  private native int GetNumberOfYDivisions_8();
  public int GetNumberOfYDivisions()
  {
    return GetNumberOfYDivisions_8();
  }

  private native int GetNumberOfZDivisions_9();
  public int GetNumberOfZDivisions()
  {
    return GetNumberOfZDivisions_9();
  }

  private native void SetNumberOfDivisions_10(int id0[]);
  public void SetNumberOfDivisions(int id0[])
  {
    SetNumberOfDivisions_10(id0);
  }

  private native void SetNumberOfDivisions_11(int id0,int id1,int id2);
  public void SetNumberOfDivisions(int id0,int id1,int id2)
  {
    SetNumberOfDivisions_11(id0,id1,id2);
  }

  private native int[] GetNumberOfDivisions_12();
  public int[] GetNumberOfDivisions()
  {
    return GetNumberOfDivisions_12();
  }

  private native void GetNumberOfDivisions_13(int id0[]);
  public void GetNumberOfDivisions(int id0[])
  {
    GetNumberOfDivisions_13(id0);
  }

  private native void SetAutoAdjustNumberOfDivisions_14(boolean id0);
  public void SetAutoAdjustNumberOfDivisions(boolean id0)
  {
    SetAutoAdjustNumberOfDivisions_14(id0);
  }

  private native boolean GetAutoAdjustNumberOfDivisions_15();
  public boolean GetAutoAdjustNumberOfDivisions()
  {
    return GetAutoAdjustNumberOfDivisions_15();
  }

  private native void AutoAdjustNumberOfDivisionsOn_16();
  public void AutoAdjustNumberOfDivisionsOn()
  {
    AutoAdjustNumberOfDivisionsOn_16();
  }

  private native void AutoAdjustNumberOfDivisionsOff_17();
  public void AutoAdjustNumberOfDivisionsOff()
  {
    AutoAdjustNumberOfDivisionsOff_17();
  }

  private native void SetDivisionOrigin_18(double id0,double id1,double id2);
  public void SetDivisionOrigin(double id0,double id1,double id2)
  {
    SetDivisionOrigin_18(id0,id1,id2);
  }

  private native void SetDivisionOrigin_19(double id0[]);
  public void SetDivisionOrigin(double id0[])
  {
    SetDivisionOrigin_19(id0);
  }

  private native double[] GetDivisionOrigin_20();
  public double[] GetDivisionOrigin()
  {
    return GetDivisionOrigin_20();
  }

  private native void SetDivisionSpacing_21(double id0,double id1,double id2);
  public void SetDivisionSpacing(double id0,double id1,double id2)
  {
    SetDivisionSpacing_21(id0,id1,id2);
  }

  private native void SetDivisionSpacing_22(double id0[]);
  public void SetDivisionSpacing(double id0[])
  {
    SetDivisionSpacing_22(id0);
  }

  private native double[] GetDivisionSpacing_23();
  public double[] GetDivisionSpacing()
  {
    return GetDivisionSpacing_23();
  }

  private native void SetPointGenerationMode_24(int id0);
  public void SetPointGenerationMode(int id0)
  {
    SetPointGenerationMode_24(id0);
  }

  private native int GetPointGenerationModeMinValue_25();
  public int GetPointGenerationModeMinValue()
  {
    return GetPointGenerationModeMinValue_25();
  }

  private native int GetPointGenerationModeMaxValue_26();
  public int GetPointGenerationModeMaxValue()
  {
    return GetPointGenerationModeMaxValue_26();
  }

  private native int GetPointGenerationMode_27();
  public int GetPointGenerationMode()
  {
    return GetPointGenerationMode_27();
  }

  private native void SetPointGenerationModeToUseInputPoints_28();
  public void SetPointGenerationModeToUseInputPoints()
  {
    SetPointGenerationModeToUseInputPoints_28();
  }

  private native void SetPointGenerationModeToBinPoints_29();
  public void SetPointGenerationModeToBinPoints()
  {
    SetPointGenerationModeToBinPoints_29();
  }

  private native void SetPointGenerationModeToBinCenters_30();
  public void SetPointGenerationModeToBinCenters()
  {
    SetPointGenerationModeToBinCenters_30();
  }

  private native void SetPointGenerationModeToBinAverages_31();
  public void SetPointGenerationModeToBinAverages()
  {
    SetPointGenerationModeToBinAverages_31();
  }

  private native void SetProducePointData_32(boolean id0);
  public void SetProducePointData(boolean id0)
  {
    SetProducePointData_32(id0);
  }

  private native boolean GetProducePointData_33();
  public boolean GetProducePointData()
  {
    return GetProducePointData_33();
  }

  private native void ProducePointDataOn_34();
  public void ProducePointDataOn()
  {
    ProducePointDataOn_34();
  }

  private native void ProducePointDataOff_35();
  public void ProducePointDataOff()
  {
    ProducePointDataOff_35();
  }

  private native void SetProduceCellData_36(boolean id0);
  public void SetProduceCellData(boolean id0)
  {
    SetProduceCellData_36(id0);
  }

  private native boolean GetProduceCellData_37();
  public boolean GetProduceCellData()
  {
    return GetProduceCellData_37();
  }

  private native void ProduceCellDataOn_38();
  public void ProduceCellDataOn()
  {
    ProduceCellDataOn_38();
  }

  private native void ProduceCellDataOff_39();
  public void ProduceCellDataOff()
  {
    ProduceCellDataOff_39();
  }

  private native boolean GetLargeIds_40();
  public boolean GetLargeIds()
  {
    return GetLargeIds_40();
  }

  public vtkBinnedDecimation() { super(); }

  public vtkBinnedDecimation(long id) { super(id); }
  public native long   VTKInit();

}
