// java wrapper for vtkExtractHistogram2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractHistogram2D extends vtkStatisticsAlgorithm
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

  private native void SetNumberOfBins_4(int id0,int id1);
  public void SetNumberOfBins(int id0,int id1)
  {
    SetNumberOfBins_4(id0,id1);
  }

  private native void SetNumberOfBins_5(int id0[]);
  public void SetNumberOfBins(int id0[])
  {
    SetNumberOfBins_5(id0);
  }

  private native int[] GetNumberOfBins_6();
  public int[] GetNumberOfBins()
  {
    return GetNumberOfBins_6();
  }

  private native void SetComponentsToProcess_7(int id0,int id1);
  public void SetComponentsToProcess(int id0,int id1)
  {
    SetComponentsToProcess_7(id0,id1);
  }

  private native void SetComponentsToProcess_8(int id0[]);
  public void SetComponentsToProcess(int id0[])
  {
    SetComponentsToProcess_8(id0);
  }

  private native int[] GetComponentsToProcess_9();
  public int[] GetComponentsToProcess()
  {
    return GetComponentsToProcess_9();
  }

  private native void SetCustomHistogramExtents_10(double id0,double id1,double id2,double id3);
  public void SetCustomHistogramExtents(double id0,double id1,double id2,double id3)
  {
    SetCustomHistogramExtents_10(id0,id1,id2,id3);
  }

  private native void SetCustomHistogramExtents_11(double id0[]);
  public void SetCustomHistogramExtents(double id0[])
  {
    SetCustomHistogramExtents_11(id0);
  }

  private native double[] GetCustomHistogramExtents_12();
  public double[] GetCustomHistogramExtents()
  {
    return GetCustomHistogramExtents_12();
  }

  private native void SetUseCustomHistogramExtents_13(int id0);
  public void SetUseCustomHistogramExtents(int id0)
  {
    SetUseCustomHistogramExtents_13(id0);
  }

  private native int GetUseCustomHistogramExtents_14();
  public int GetUseCustomHistogramExtents()
  {
    return GetUseCustomHistogramExtents_14();
  }

  private native void UseCustomHistogramExtentsOn_15();
  public void UseCustomHistogramExtentsOn()
  {
    UseCustomHistogramExtentsOn_15();
  }

  private native void UseCustomHistogramExtentsOff_16();
  public void UseCustomHistogramExtentsOff()
  {
    UseCustomHistogramExtentsOff_16();
  }

  private native void SetScalarType_17(int id0);
  public void SetScalarType(int id0)
  {
    SetScalarType_17(id0);
  }

  private native void SetScalarTypeToUnsignedInt_18();
  public void SetScalarTypeToUnsignedInt()
  {
    SetScalarTypeToUnsignedInt_18();
  }

  private native void SetScalarTypeToUnsignedLong_19();
  public void SetScalarTypeToUnsignedLong()
  {
    SetScalarTypeToUnsignedLong_19();
  }

  private native void SetScalarTypeToUnsignedShort_20();
  public void SetScalarTypeToUnsignedShort()
  {
    SetScalarTypeToUnsignedShort_20();
  }

  private native void SetScalarTypeToUnsignedChar_21();
  public void SetScalarTypeToUnsignedChar()
  {
    SetScalarTypeToUnsignedChar_21();
  }

  private native void SetScalarTypeToFloat_22();
  public void SetScalarTypeToFloat()
  {
    SetScalarTypeToFloat_22();
  }

  private native void SetScalarTypeToDouble_23();
  public void SetScalarTypeToDouble()
  {
    SetScalarTypeToDouble_23();
  }

  private native int GetScalarType_24();
  public int GetScalarType()
  {
    return GetScalarType_24();
  }

  private native double GetMaximumBinCount_25();
  public double GetMaximumBinCount()
  {
    return GetMaximumBinCount_25();
  }

  private native int GetBinRange_26(long id0,long id1,double id2[]);
  public int GetBinRange(long id0,long id1,double id2[])
  {
    return GetBinRange_26(id0,id1,id2);
  }

  private native int GetBinRange_27(long id0,double id1[]);
  public int GetBinRange(long id0,double id1[])
  {
    return GetBinRange_27(id0,id1);
  }

  private native void GetBinWidth_28(double id0[]);
  public void GetBinWidth(double id0[])
  {
    GetBinWidth_28(id0);
  }

  private native long GetOutputHistogramImage_29();
  public vtkImageData GetOutputHistogramImage()
  {
    long temp = GetOutputHistogramImage_29();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSwapColumns_30(int id0);
  public void SetSwapColumns(int id0)
  {
    SetSwapColumns_30(id0);
  }

  private native int GetSwapColumns_31();
  public int GetSwapColumns()
  {
    return GetSwapColumns_31();
  }

  private native void SwapColumnsOn_32();
  public void SwapColumnsOn()
  {
    SwapColumnsOn_32();
  }

  private native void SwapColumnsOff_33();
  public void SwapColumnsOff()
  {
    SwapColumnsOff_33();
  }

  private native void SetRowMask_34(vtkDataArray id0);
  public void SetRowMask(vtkDataArray id0)
  {
    SetRowMask_34(id0);
  }

  private native long GetRowMask_35();
  public vtkDataArray GetRowMask()
  {
    long temp = GetRowMask_35();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Aggregate_36(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1);
  public void Aggregate(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1)
  {
    Aggregate_36(id0,id1);
  }

  public vtkExtractHistogram2D() { super(); }

  public vtkExtractHistogram2D(long id) { super(id); }
  public native long   VTKInit();

}
